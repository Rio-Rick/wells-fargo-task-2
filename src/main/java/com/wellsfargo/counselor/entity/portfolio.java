package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Portfolio {
    
        @Id
        @GeneratedValue()
        private long portfolioId;
        
        @Column(nullable = false, unique = true)
        private Date creationDate;

        @ManyToOne
        @JoinColumn(name = "clientId", nullable = false)
        private Client client;


        protected portfolio() {

        }
    
        public portfolio(Date creationDate, Client client) {
            this.creationDate = creationDate;
            this.client = client;
        }
    
        public Long getPortfolioId() {
            return portfolioId;
        }
    
        public Date getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(Date creationDate) {
            this.creationDate = creationDate;
        }

        public Client getClient() {
            return client;
        }
}