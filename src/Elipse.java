public class Elipse {
        double cx, cy, rx, ry, strokeWidth;
        String fill, stroke;
        public int getCx() {
            return (int) cx;
        }
        public int getCy() {
            return (int) cy;
        }
        public int getRx() {
            return (int) rx;
        }

        public int getRy() {
            return (int) ry;
        }

        public int getStrokeWidth() {
            return (int) strokeWidth;
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

        public void setRx(double rx) {
            this.rx = rx;
        }

        public void setRy(double ry) {
            this.ry = ry;
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
            return "Elipse{" + "cx=" + cx + ", cy=" + cy + ", rx=" + rx +
                    ", ry=" + ry + ", strokeWidth=" + strokeWidth +
                    ", fill='" + fill + '\'' + ", stroke='" + stroke + '\'' + '}';
        }
    }

