public class DeMorganComparison {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;
        boolean booleanVar = A | B;
        System.out.println("Вихідне відображення логічнох операції A | B  = " + " еквівалентне значенню !(!A & !B) " + booleanVar);
        // ! - not  і вираз !(!A & !B) не !A( прийнямає знаяення false) а !B (приймає значення true) і їм обом присвоїється ще один !NOT то вираз знову змінює свої воказники на вихідні ,а з врахуванням
        // дизюнкції при виразі A | B має завжди значення True.
        // Тому вихідний вираз A | B (true | falce ) є еквівалентним  !(!A & !B)  де  NOT!(  NOT !А (false) & NOT !B (true) ) = міняє своє значення на А (true) & B (false)
        }
    }

