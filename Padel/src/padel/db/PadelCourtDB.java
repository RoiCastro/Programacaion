/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padel.db;

import java.util.ArrayList;
import padel.model.PadelCourt;

/**
 *
 * @author roi.castrocalvar
 */
public class PadelCourtDB {

    public ArrayList<PadelCourt> getAllCourts() {
        return PadelManagerDB.getCourts();
    }
}
