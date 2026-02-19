
package linkedlist_generic_demo;


public class Magazine {
    
    private String title;   //magazine title
    private String editor;  //meaning: editor in chief

    public Magazine(String title, String editor) {
        this.title = title;
        this.editor = editor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
    
    @Override
    public String toString() {
        //changed delimeters to |  |
        return "|" + "Title: " + title + ", Editor: " + editor + "|";
    }    
}
