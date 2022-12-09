
    public class Circle{
        double cx, cy,strokeWidth, r;
        String fill, stroke;

        public int getCx() {
            return (int) cx;
        }

        public int getCy() {
            return (int) cy;
        }
        public int getStrokeWidth() {
            return (int) strokeWidth;
        }

        public int getR() {
            return (int) r;
        }

        public String getFill() {
            return fill;
        }

        public String getStroke() {
            return stroke;
        }

        public void setCx(double cx) {
            this.cx = cx;
        }

        public void setCy(double cy) {
            this.cy = cy;
        }

        public void setR(double r) {
            this.r = r;
        }

        public void setStrokeWidth(double strokeWidth) {
            this.strokeWidth = strokeWidth;
        }

        public void setFill(String fill) {
            this.fill = fill;
        }

        public void setStroke(String stroke) {
            this.stroke = stroke;
        }

        @Override
        public String toString() {
            return "Circulo{" + "cx=" + cx + ", cy=" + cy +
                    ", r=" + r + ", strokeWidth=" + strokeWidth +
                    ", fill='" + fill + '\'' + ", stroke='" + stroke +
                    '\'' + '}';
        }
    }


