/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;


public class Community {
    
    private String community;
    private String city;
//    private String houses;

    @Override
    public String toString() {
        return city;
    }
    public String getCity() {
        return city;
    }
    

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
    
    
}
