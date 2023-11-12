

    public enum Branch {
        MATH("information regarding math"),
        PHYSICS("information regarding physics"),
        CS("information regarding cs"),
        ENG("information regarding eng");

        private String description;

        private Branch(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public static class Teacher {
            private int id;
            private Branch branch;

            public Teacher(int id, Branch branch) {
                this.id = id;
                this.branch = branch;
            }

            public int getId() {
                return id;
            }

            public Branch getBranch() {
                return branch;
            }

        }
    }



