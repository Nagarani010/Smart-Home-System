class DocumentFactory {
    public static Document createDocument(String type) {
        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        }
        throw new IllegalArgumentException("Unknown document type");
    }
}
