namespace java com.merciless.gleaningserver.service.thrift

struct Book {
    1: required string title,
    2: required string content
}

struct Host {
    1:required string hostName,
    2:required string location
}

service ClientService
{
    bool addBook(1:string title, 2:string content),
    list<Book> getAllBooks(),
    Book getBookByName(1:string title),
    list<Host> getAllhosts()
}

service ServerCommunication
{
    Book gleanBook(1:string title)
}
