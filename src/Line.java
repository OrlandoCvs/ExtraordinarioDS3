
    public class Line {
        double x1, y1, x2, y2, strokeWidth;
        String stroke;

        public int getX1() {
            return (int) x1;
        }

        public void setX1(double x1) {
            this.x1 = x1;
        }

        public int getY1() {
            return (int) y1;
        }

        public void setY1(double y1) {
            this.y1 = y1;
        }

        public int getX2() {
            return (int) x2;
        }

        public void setX2(double x2) {
            this.x2 = x2;
        }

        public int getY2() {
            return (int) y2;
        }

        public void setY2(double y2) {
            this.y2 = y2;
        }

        public int getStrokeWidth() {
            return (int) strokeWidth;
        }

        public void setStrokeWidth(double strokeWidth) {
            this.strokeWidth = strokeWidth;
        }

        public String getStroke() {
            return stroke;
        }

        public void setStroke(String stroke) {
            this.stroke = stroke;
        }

        @Override
        public String toString() {
            return "Linea{" + "x1=" + x1 + ", y1=" + y1 +
                    ", x2=" + x2 + ", y2=" + y2 + ", strokeWidth="
                    + strokeWidth + ", stroke='" + stroke + '\'' + '}';
        }
    }

