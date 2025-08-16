package day41_collection.day44_map_and_function.functional_interface;
/*
    <E>, <T> ---- > Generic Type: can accept any type of data

 */
@FunctionalInterface
public interface DynamicFunctionalInterface <T> {
    void test (T t);
}