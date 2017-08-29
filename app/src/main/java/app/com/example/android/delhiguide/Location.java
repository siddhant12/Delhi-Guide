package app.com.example.android.delhiguide;

/**
 * Created by Siddhant on 23-08-2017.
 */

public class Location {

    private String name;
    private String description;
    private String address;
    private String phone;
    private String schedule;
    private String price;
    private static final int NO_IMAGE=-1;
    private int imageResourceId=NO_IMAGE;

    public Location(String name,String description,String address,String phone,String schedule,String price,int imageResourceId)
    {
        this.name=name;
        this.description=description;
        this.address=address;
        this.phone=phone;
        this.schedule=schedule;
        this.price=price;
        this.imageResourceId=imageResourceId;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getSchedule()
    {
        return schedule;
    }

    public String getPrice(){
        return price;
    }

    public int getImageResourceId()
    {
        return  imageResourceId;
    }

    boolean hasImage()
    {
        return imageResourceId!=NO_IMAGE;
    }

    public boolean hasPrice(){
        return getPrice() != null;
    }

    public boolean hasPhone(){
        return getPhone() != null;
    }

    public boolean hasAddress(){
        return getAddress() != null;
    }

    public boolean hasSchedule(){
        return getSchedule() != null;
    }

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getPrice() + "\n" +
                getSchedule() + "\n" +
                getImageResourceId()
                ;

        return output;
    }
}

