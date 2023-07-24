grammar Validation;

@header{
    package expression;
}

validationStatement:
v (Seperator v)*
;

v : (v0 | v11 ) ;
v0: (v1 | v2 | v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 | v12 );
v1: isNot Exist (keyString|keyStringMap) #existKey;
v2: isNot Datatype (keyString|keyStringMap) type #datatype;
v3: (keyString|keyStringMap) EuqalEuqal (keyString|type)  #equal;
v4: RESPONSE_LEFT (keyString|keyStringMap) EuqalEuqal RESPONSE_RIGHT (keyString|keyStringMap) #checkForBoth;
v5: keyString AdditionalOperators keyString #checkForAdditionalOperators;
v6: statement (OPERATORS statement)* EuqalEuqal keyString #calculate;
v7: SORT keyString BY keyString order #sorting;
v8: isMaxMin keyStringMap EuqalEuqal keyString #maxMinCheck;
v9: functionNames? (keyString|keyStringMap) functionResult  #functionCheck;
v10: Date keyString Pattern dateTime #dateTimePatternCheck;
v11: v0 LogicalOperators v0  #operators;
v12: Match (keyString|keyStringMap) REGEX  #regexMatch;

Exist   : E X I S T;
Datatype : D A T A T Y P E;
RESPONSE_LEFT : R E S P O N S E '_' L E F T;
RESPONSE_RIGHT : R E S P O N S E '_' R I G H T;
SORT : S O R T;
ASC : A S C;
DESC : D E S C;
BY : B Y ;
MAX : M A X;
MIN : M I N;
Date : D A T E;
Pattern : P A T T E R N;
Match : M A T C H;
Regex: R E G E X;



dateTime:
  ('"')? Identifier ('-'Identifier)* (Identifier(':'Identifier)*)? ('"')?
;

functionResult:
functionNames type
| EuqalEuqal type
|  ('&'keyString)+ EuqalEuqal ('"')?Identifier('"')?
;

functionNames:
'contains' | 'startsWith' | 'endsWith'
| 'floor' | 'ceil' | 'round'
| 'lengthOf' | 'sizeOf' | 'concat'
;

isMaxMin:
MAX | MIN
;

order:
ASC | DESC ;

statement :
OP_Bracket* keyString (OPERATORS OP_Bracket* keyString OP_Bracket*)+
;

isNot:
'!'?
;

keyString
 : Identifier
 | Identifier('.'Identifier)*?
 ;

type
: Identifier
| ('"')? Identifier (Identifier)* ('"')?
;

keyStringMap
 : Identifier('[]')
 | Identifier('[]')('.'Identifier)*?
 | keyString('[]')('.'Identifier)*?
 | keyString('[' Identifier ']')('.'Identifier)*?
  ;


Identifier
 : [a-zA-Z_0-9] [a-zA-Z_0-9\-]*
 ;

REGEX:
  Regex  (~[\n])+
;


// Alphabet
fragment E : 'e' | 'E';
fragment I : 'i' | 'I';
fragment S : 's' | 'S';
fragment T : 't' | 'T';
fragment X : 'x' | 'X';

fragment D : 'd' | 'D';
fragment A : 'a' | 'A';
fragment Y : 'y' | 'Y';
fragment P : 'p' | 'P';

fragment R : 'r' | 'R';
fragment O : 'o' | 'O';
fragment N : 'n' | 'N';

fragment L : 'l' | 'L';
fragment F : 'f' | 'F';
fragment G : 'g' | 'G';
fragment H : 'h' | 'H';

fragment B : 'b' | 'B';
fragment C : 'c' | 'C';
fragment M : 'm' | 'M';


Seperator : [\n] | ',' | ',\n' | '\n,' ;

EuqalEuqal : '==' | '!=' ;

LogicalOperators : '&&' | '||' ;

AdditionalOperators : EuqalEuqal | '<'| '>'| '<=' | '>=' ;

OPERATORS: '+' | '-' | '/' | '*' | '%' | '^';

OP_Bracket: '(' | ')' ;

WS: [ \n\t\r\\] + -> skip;