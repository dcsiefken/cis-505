/*
    Clay Siefken (2024) CIS 505 Intermediate Java Programming. Bellevue Univ.
*/

package Module_9.Discussion;

public class Outer {
    public class PublicInner {
        public void publicSayHello() {
            System.out.println("Hello from public method, public inner, public outer");
        }

        private void privateSayHello() {
            System.out.println("Hello from private method, public inner, public outer");
        }
    }

    private class PrivateInner {
        public void publicSayHello() {
            System.out.println("Hello from public method, private inner, public outer");
        }

        private void privateSayHello() {
            System.out.println("Hello from private method, private inner, public outer");
        }
    }

    public void TestAccess() {
        new PublicInner().publicSayHello();
        new PublicInner().privateSayHello();
        new PrivateInner().publicSayHello();
        new PrivateInner().privateSayHello();
    }
}