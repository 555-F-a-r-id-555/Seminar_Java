package Lesson_15.Work2;

//Принцип интерфейсов разделения (Interface Segregation Principle): ISP
// Интерфейсы были разделены на более мелкие для конкретных отчетов.
// Принцип единственной ответственности (Single Responsibility Principle): SRP
// Каждый класс имеет только одну ответственность, связанную с генерацией определенного типа отчета.
//Принцип разделения зависимостей (Dependency Inversion Principle): DIP
// Классы DocumentReportGenerator и AccountReportGenerator зависят
// от абстракций (интерфейсов) XmlReportGenerator и JsonReportGenerator соответственно,
// что обеспечивает инверсию зависимостей


public class Main {
    public static void main(String[] args) {
        DocumentReportGenerator xmlDocumentReportGenerator = new DocumentReportGenerator();

        System.out.println("XMLReport: " +xmlDocumentReportGenerator.generateXml());
        System.out.println("JSonReport: " + xmlDocumentReportGenerator.generateJson());


        AccountReportGenerator jsonAccountReportGenerator = new AccountReportGenerator();

        System.out.println("JSonReport: " + jsonAccountReportGenerator.generateJson());

    }
}
