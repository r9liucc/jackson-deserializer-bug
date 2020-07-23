A reproduction of a Jackson deserializer Exception
===
Just run main class(`TestDeser.java`), it will throw:

```
com.fasterxml.jackson.databind.exc.MismatchedInputException: No _valueDeserializer assigned
```

To hide the exception, just rename Room.something to Room.outer.

With a quick look in the source code, I found that the hashcode of the field 
name impacts the deserializers initialization order, 
then the usage of type inheritance and circular reference will be problematic.    

