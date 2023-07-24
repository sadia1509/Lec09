package util

class PropertiesData {
    def data = [:]
    static String selectedEnv

    void init() {
        Properties properties = new Properties()
        File propertiesFile = new File("src/gradle.properties")
        propertiesFile.withInputStream {
            properties.load(it)
        }
        selectedEnv = properties.get("env").toString().toLowerCase()
        loadDataProperties(selectedEnv)
    }

    void loadDataProperties(String selectedEnv) {
        Properties properties = new Properties()
        File propertiesFile = new File("src/main/resources/data/"
                + selectedEnv + "/data.properties")
        propertiesFile.withInputStream { properties.load(it) }
        properties.each { prop, val ->
            data.put(prop, val)
        }
    }

    def getDataByKey(String key) {
        data.get(key)
    }


}


