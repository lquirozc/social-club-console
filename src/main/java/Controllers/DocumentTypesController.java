package Controllers;

public interface DocumentTypesController {
	
	public int ValidateDocumentType(String option) throws Exception;
	public String ValidateDocumentExists(String document) throws Exception;
}
