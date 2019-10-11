namespace java com.merciless.gleaningserver.service.thrift

service BooksService
{
    bool addBook(1:string title, 2:string content)
}
