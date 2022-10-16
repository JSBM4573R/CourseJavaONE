package AccessModifiers;

/**
 * Contiene los 4 modificadores de acceso de java
 */
public class Modifiers {

  public static void main(String[] args) {

    //Accesible solo dentro del mismo paquete
    DefaultModifier defaultModifierAccesModifier = new DefaultModifier();
    defaultModifierAccesModifier.setName("dafault");

    //Accesible solo desde la misma clase
    PrivateModifier privateModifierAccesModifier = new PrivateModifier();
    privateModifierAccesModifier.setName("private");

    //default + clases hijas
    ProtectedModifier protectedModifierAccesModifier = new ProtectedModifier();
    protectedModifierAccesModifier.setName("protected");

    //Accesible desde cualquier parte
    PublicModifier publicModifierAccesModifier = new PublicModifier();
    publicModifierAccesModifier.setName("public");

    System.out.println("Tenemos cuatro modificadores de acceso: private, protected, default y public. " +
            "Donde el orden del mas restrictivo al menos restrictivo es:"+ "\n" +
        privateModifierAccesModifier.getName() + "\n" +
        defaultModifierAccesModifier.name + "\n" +
        protectedModifierAccesModifier.name + "\n" +
        publicModifierAccesModifier.name + "\n");

  }


}
