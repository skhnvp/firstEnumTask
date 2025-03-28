package ru.stepup;

enum Spicy {
    VERY_HOT(){
        @Override
        public String toString() {
            return "Очень острый";
        }
    },
    HOT(){
        @Override
        public String toString() {
            return "Острый";
        }
    },
    NOT_HOT(){
        @Override
        public String toString() {
            return "Не острый";
        }
    }
}