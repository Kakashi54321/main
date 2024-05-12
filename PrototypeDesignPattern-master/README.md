# PrototypeDesignPattern

The prototype pattern is one of the five creational patterns that is used when the creation of new objects is done by cloning an existing instance.

# Type: This falls in creational design pattern.

# Explanation:
1. There is a class Book, that's just have bood attributes(book id and name). 
2. There is a class BookShop which has shop attributes(shop name and list of books), also this class implements clonable interface for deep cloning. And this class is responsible for loading the data ideally from any DB but for demo, i am loading it manually.
3. In Main class PrototypeMain, i am creating one book shop and loading books into that shop and with deep cloning creating another book shop and loading same books via cloning rather than seperate DB call.

So, in this way we can see with prototype design pattern, we can reduce expensive operation like DB calls and have the same operations done via cloning.
