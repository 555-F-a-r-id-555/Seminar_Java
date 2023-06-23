Коллекция Deque (Double Ended Queue, двусторонняя очередь) представляет собой структуру данных, которая предоставляет функциональность добавления, удаления и доступа к элементам как в начале, так и в конце очереди. Она представляет собой расширение интерфейса Queue и поддерживает все его операции.

Основные операции, которые можно выполнить с помощью Deque, включают:

****Добавление элемента:****

1. addFirst(element) или offerFirst(element): добавляет элемент в начало очереди.
2. addLast(element) или offerLast(element): добавляет элемент в конец очереди.
3. 
****Удаление элемента:****

3. removeFirst(): удаляет и возвращает первый элемент из начала очереди. Если очередь пуста, генерируется исключение NoSuchElementException.
4. pollFirst(): удаляет и возвращает первый элемент из начала очереди. Если очередь пуста, возвращает null.
5. removeLast(): удаляет и возвращает последний элемент из конца очереди. Если очередь пуста, генерируется исключение NoSuchElementException.
6. pollLast(): удаляет и возвращает последний элемент из конца очереди. Если очередь пуста, возвращает null.

****Доступ к элементам:****

7. getFirst(): возвращает первый элемент из начала очереди без удаления. Если очередь пуста, генерируется исключение NoSuchElementException.
8. peekFirst(): возвращает первый элемент из начала очереди без удаления. Если очередь пуста, возвращает null.
9. getLast(): возвращает последний элемент из конца очереди без удаления. Если очередь пуста, генерируется исключение NoSuchElementException.
10. peekLast(): возвращает последний элемент из конца очереди без удаления. Если очередь пуста, возвращает null.

Deque может быть использована в различных ситуациях, 

* где требуется доступ к элементам как в начале, так и в конце коллекции. 
Некоторые примеры использования включают реализацию стеков, 
* очередей, обхода дерева в ширину и других алгоритмов, 
* где необходима двусторонняя обработка элементов.