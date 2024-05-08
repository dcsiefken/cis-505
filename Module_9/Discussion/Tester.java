/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_9.Discussion;

public class Tester {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.TestAccess();
        // Outer.PrivateInner privateInner = outer.new PrivateInner(); // can't do this.
        Outer.PublicInner publicInner = outer.new PublicInner();
        publicInner.publicSayHello();
        // publicInner.privateSayHello(); // can't do this.
    }
}