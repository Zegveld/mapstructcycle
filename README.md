# MapStruct Cycle

In [mapstruct-mapping-with-cycles](https://github.com/mapstruct/mapstruct-examples/tree/master/mapstruct-mapping-with-cycles) the cycle stops at data access level but not at json level when you try to convert the dto to json because the dto's still have the dependencies on each other.

The main branch shows the use case.

The branch attempttosolve1 use the mapstruct-mapping-with-cycles strategy, it solves the cycle at data access level but not at json level. Try: http://localhost:8080/mother

The branch attempttosolve2 use the "Update 2" strategy from [Prevent Cyclic references when converting with MapStruct](https://stackoverflow.com/questions/36223752/prevent-cyclic-references-when-converting-with-mapstruct), it solves the both the cycles at data access level and at json level.

Unfortunately, the "Update 2" strategy is some cumbersome when you have a more complex use case, for example: Father->Child->Pet.

I solved the cycle at json level on attempttosolve1 by using @AfterMapping ans setting the ofending dependencies to null. 