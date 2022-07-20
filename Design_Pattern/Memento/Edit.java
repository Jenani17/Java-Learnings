package Memento;

public class Edit {
	
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        editTool editTool = new editTool(); 

        editTool.addDesign(new Photo("Add Color"));
        editTool.addDesign(new Photo("Crop"));
        careTaker.save(editTool);
        System.out.println(editTool);

        editTool.addDesign(new Photo("Draw"));
        careTaker.save(editTool);
        System.out.println(editTool);

        editTool.addDesign(new Photo("Doodle"));
        careTaker.save(editTool);
        System.out.println(editTool);

        careTaker.revert(editTool);
        System.out.println(editTool);

        editTool.addDesign(new Photo("Brightness"));
      
        System.out.println(editTool);

        careTaker.revert(editTool);
        System.out.println(editTool);

        careTaker.revert(editTool);
        System.out.println(editTool);

    }
}
