***Примеры для каждого метода коллекции Map в Java:***

1. put(key, value) – добавляет пару ключ-значение в карту

```
Map<String, Integer> map = new HashMap<>();
map.put("one", 1);
map.put("two", 2);
```

2. get(key) – возвращает значение, связанное с указанным ключом

```
Map<String, Integer> map = new HashMap<>();
map.put("one", 1);
map.put("two", 2);
Integer value = map.get("one"); // value = 1
```

3. remove(key) – удаляет пару ключ-значение, связанную с указанным ключом

```
Map<String, Integer> map = new HashMap<>();
map.put("one", 1);
map.put("two", 2);
map.remove("one");
```

4. containsKey(key) – возвращает true, если заданный ключ есть в карте

```
Map<String, Integer> map = new HashMap<>();
map.put("one", 1);
map.put("two", 2);
boolean containsKey = map.containsKey("one"); // containsKey = true
```

5. containsValue(value) – возвращает true, если заданное значение есть в карте

```
Map<String, Integer> map = new HashMap<>();
map.put("one", 1);
map.put("two", 2);
boolean containsValue = map.containsValue(2); // containsValue = true
```

6. keySet() – возвращает множество ключей, содержащихся в карте

```
Map<String, Integer> map = new HashMap<>();
map.put("one", 1);
map.put("two", 2);
Set<String> keys = map.keySet(); // keys = ["one", "two"]
```

7. entrySet() – возвращает множество пар ключ-значение, которые содержатся в карте

```
Map<String, Integer> map = new HashMap<>();
map.put("one", 1);
map.put("two", 2);
Set<Map.Entry<String, Integer>> entries = map.entrySet(); // entries = [{"one", 1}, {"two", 2}]
```