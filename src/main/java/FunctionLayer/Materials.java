/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author simon
 */
public class Materials {
    
    Pillar pillar;
    Roofplate400x400 roofplate400;
    Roofplate200x200 roofplate1000;
    Rafter rafter;
    Screw seam;

    public Materials(Pillar pillar, Roofplate400x400 roofplate400, Roofplate200x200 roofplate1000, Rafter rafter, Screw seam) {
        this.pillar = pillar;
        this.roofplate400 = roofplate400;
        this.roofplate1000 = roofplate1000;
        this.rafter = rafter;
        this.seam = seam;
    }

    public Pillar getPillar() {
        return pillar;
    }

    public void setPillar(Pillar pillar) {
        this.pillar = pillar;
    }

    public Roofplate400x400 getRoofplate400() {
        return roofplate400;
    }

    public void setRoofplate400(Roofplate400x400 roofplate400) {
        this.roofplate400 = roofplate400;
    }

    public Roofplate200x200 getRoofplate1000() {
        return roofplate1000;
    }

    public void setRoofplate1000(Roofplate200x200 roofplate1000) {
        this.roofplate1000 = roofplate1000;
    }

    public Rafter getrafter() {
        return rafter;
    }

    public void setrafter(Rafter rafter) {
        this.rafter = rafter;
    }

    public Screw getSeam() {
        return seam;
    }

    public void setSeam(Screw seam) {
        this.seam = seam;
    }

    @Override
    public String toString() {
        return "Materials{" + "pillar=" + pillar + ", roofplate400=" + roofplate400 + ", roofplate1000=" + roofplate1000 + ", rafter=" + rafter + ", seam=" + seam + '}';
    }
    
}
