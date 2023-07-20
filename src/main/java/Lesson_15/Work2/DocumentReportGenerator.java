package Lesson_15.Work2;

public class DocumentReportGenerator implements ReportGeneratorXML,ReportGeneratorJSON{
    @Override
    public String generateXml() {
        String xmlReport = "\"<xml>...</xml>\"";
        // todo Logic
        return xmlReport;
    }

    @Override
    public String generateJson() {
        String jsonReport = "...";
        // todo Logic
        return jsonReport;
    }
}
