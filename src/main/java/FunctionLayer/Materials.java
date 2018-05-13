/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;


public class Materials {
/* Har rettet det til hvad Jon skrev der skulle være i java klassen, det her er hvordan det skulle se ud i databasen.
    Hvis det skal rettes igen tager det 2 sek så chill.
    
    private int MaterialsID;
    private String MaterialsName;
    private int MaterialsInStock;
    private int Pris;
    private int Type;
    private int length;
*/

private int id;
private int type;
private int length;

    public Materials(int id, int type, int length) {
        this.id = id;
        this.type = type;
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Materials{" + "id=" + id + ", type=" + type + ", length=" + length + '}';
    }


}
