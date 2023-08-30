public class House {
  private String label;
  private boolean needsPackage;

  public House(String label, boolean needsPackage) {
    this.label = label;
    this.needsPackage = needsPackage;
  }

  public String getLabel() {
    return label;
  }

  public boolean getNeedsPackage() {
    return needsPackage;
  }

  public void setNeedsPackage(boolean setta) {
    this.needsPackage = setta;
  }
}