package Memento;

import java.util.ArrayList;


public class editTool {
    ArrayList<Photo> photos = new ArrayList<Photo>();
 
    public ArrayList<Photo> getPhotos() {
        return (ArrayList) photos.clone();
    }

    public Memento save() {
        return new Memento(getPhotos());
    }

    public void revert(Memento Memento) {
    	photos = Memento.getPhotos();
    }

    @Override
    public String toString() {
        return "editTool{" + "layers" + photos + '}';
    }

    static class Memento {
        ArrayList<Photo> photos;

        public Memento(ArrayList<Photo> photos) {
            this.photos = photos;
        }

        private ArrayList<Photo> getPhotos() {
            return photos;
        }

    }

	public void addDesign(Photo photo) {
		photos.add(photo);
		
	}

}


