/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class CommunityHistory {
     ArrayList<Community> CommunityDetails;

    public CommunityHistory() {
        this.CommunityDetails = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityDetails() {
        return CommunityDetails;
    }

    public void setCommunityDetails(ArrayList<Community> CommunityDetails) {
        this.CommunityDetails = CommunityDetails;
    }
    
    public Community addCommunity() {

        Community CommData = new Community();
        CommunityDetails.add(CommData);
        return CommData;

    }
    
    
}
