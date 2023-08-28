package ModelsImp;

import java.util.UUID;

public class DocumentTypes {
	
	public DocumentTypes(String documentType) {
		this.documentTypeId = UUID.randomUUID();
		this.documentType = documentType;
	}
	
	private UUID documentTypeId;
	private String documentType;
	
	public UUID getDocumentTypeId() {
		return documentTypeId;
	}
	
	public String getDocumentType() {
		return documentType;
	}

	
}
