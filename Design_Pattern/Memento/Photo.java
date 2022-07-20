package Memento;

public class Photo {
	
    String features;

    public Photo(String features) {
        this.features = features;

    }

	@Override
	public String toString() {
		return  "Photo [features=" + features +  '\'' +  "]";
	}


    
}
