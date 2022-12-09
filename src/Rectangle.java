public class Rectangle {

        double x,y,width, height,strokeWidth;
        String fill, stroke;

        public int getX() {
            return (int) x;
        }

        public int getY() {
            return (int) y;
        }

        public int getWidth() {
            return (int) width;
        }

        public int getHeight() {
            return (int) height;
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

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public void setHeight(double height) {
            this.height = height;
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
            return "Rectangulo{" + "x=" + x + ", y=" + y +
                    ", width=" + width + ", height=" + height +
                    ", strokeWidth=" + strokeWidth + ", fill='"
                    + fill + '\'' + ", stroke='" + stroke + '\'' + '}';
        }
    }

