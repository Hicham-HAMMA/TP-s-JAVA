package cigma.pfe.models;

import lombok.Data;

import javax.persistence.Entity;


    @Data
    @Entity
    public class ClientNormal extends Client{
        private int importanceLevel;

        public ClientNormal(String name, int importanceLevel) {
            super(name);
            this.importanceLevel = importanceLevel;
        }

        public ClientNormal() {
        }
}
