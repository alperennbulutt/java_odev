package sample.View;


public abstract class Chart  {

    private String title;
    private String xAxisLabel;

    public Chart(String title, String xAxisLabel){
        this.title=title;
        this.xAxisLabel=xAxisLabel;
    }

    public Chart() {

    }


    public void setTitle(String title){

        this.title=title;
    }

    public void reset(){

    }


}
