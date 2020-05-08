package model;

import model.firstmodel.FirstModel;
import model.secondmodel.SecondModel;

public class AllModels {

    FirstModel firstModel;
    SecondModel secondModel;

    public AllModels() {
    }

    public AllModels(FirstModel firstModel, SecondModel secondModel) {
        this.firstModel = firstModel;
        this.secondModel = secondModel;
    }

    public FirstModel getFirstModel() {
        return firstModel;
    }

    public void setFirstModel(FirstModel firstModel) {
        this.firstModel = firstModel;
    }

    public SecondModel getSecondModel() {
        return secondModel;
    }

    public void setSecondModel(SecondModel secondModel) {
        this.secondModel = secondModel;
    }

    @Override
    public String toString() {
        return "AllModels{" +
                "firstModel=" + firstModel +
                ", secondModel=" + secondModel +
                '}';
    }
}
