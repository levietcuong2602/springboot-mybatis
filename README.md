### Summary Datasource:
1. **An Entity:** Is a lightweight persistence domain object. Typically, an entity represents a table in a relational database, and each entity instance corresponds to a row in that table.
2. **DTO (Data Transfer Object):** Are containers which are used to transport data between layers and tiers.
3. **VO - A Value Object** Represents itself a fixed set of data and is similar to a Java enum.
4. **Domain** Contains all Entities and Value Objects. And some other types of classes depending on the classification you use.
5. **Model** Defines a holder for model attributes and is primarily designed for adding attributes to the model.

### Code Structure

```
springboot-mybatis
├── main
    ├── java
        ├── com.smartosc
            ├── common 
                ├── mbg Mybatis
                ├── response
                
            ├── component
            ├── config 
            ├── controller 
            ├── datasource
                ├── entity Mybatis
                ├── dto data transfer exchange btw client - server 
                    ├── param 
                    
                ├── mapper Mybatis mapper（DAO）
                    ├── dao
                    
                ├── vo value object
                
            ├── service Layer Serive Logic recieve data from controller
                ├── impl
                
            SpringbootMybatisApplication

    ├── resource
        ├── cn.smartosc.mapper Config mapper xml
            ├── dao
            
        ├── config
        
            MybatisGeneratorConfig.xml Mybatis generator

        application.property Environment 
        database.properties Config database
        database.sql

```