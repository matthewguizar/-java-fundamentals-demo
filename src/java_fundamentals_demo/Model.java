package java_fundamentals_demo;

public class Model {
    private String type;
    private String purpose;

    public Model(String modelName, String purpose) {
        this.type = modelName;
        this.purpose = purpose;
    }
    public String getType() {return this.type;}
    public void setType(String type) {this.type = type;}
    public String getPurpose() {return this.purpose;}
    public void setPurpose(String purpose) {this.purpose = purpose;}
    public String toString() { return "Model Name: '" + type + "" + "' Purpose: '" + purpose + "'";}
}
