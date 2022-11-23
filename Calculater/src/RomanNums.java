public enum RomanNums {

    I( "I", 1 ),
    II( "II", 2 ),
    III( "III", 3 ),
    IV( "IV", 4 ),
    V( "V", 5 ),
    VI( "VI", 6 ),
    VII( "VII", 7 ),
    VIII( "VIII", 8 ),
    IX( "IX", 9 ),
    X("X", 10);

    final String roman;
    final int arabic;

    RomanNums(String roman, int arabic) {
        this.roman = roman;
        this.arabic = arabic;
    }



    public String getRoman() {
        return roman;
    }

    public int getArabic() {
        return arabic;
    }
    public static int toArabic( String roman ) {
        for( RomanNums i: values() ) {
            if ( i.getRoman().equals( roman )) {
                return i.getArabic();
            }
        }
        throw new IllegalArgumentException( "арабскиие цифры" + roman + " is out of range" );
    }

    public static String toRoman( int arabic ) {
        for( RomanNums i: values() ) {
            if ( i.getArabic() == arabic ) {
                return i.getRoman();
            }
        }
        throw new IllegalArgumentException( "римские цифры " + arabic + " is out of range" );
    }
}

