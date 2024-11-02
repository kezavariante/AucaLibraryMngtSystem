package model;

import java.util.Date;
import java.util.UUID;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "borrower")
public class Borrower {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id", nullable = false)
    private Book book;

    @Column(name = "reader_id", nullable = false)
    private UUID reader_id;

    @Temporal(TemporalType.DATE)
    @Column(name = "pickup_date")
    private Date pickup_date;

    @Temporal(TemporalType.DATE)
    @Column(name = "due_date")
    private Date due_date;

    @Temporal(TemporalType.DATE)
    @Column(name = "return_date")
    private Date return_date;

    private int late_charge_fees = 0;

    public Borrower() {}

    public Borrower(UUID id, Book book, UUID reader_id, Date pickup_date, Date due_date, Date return_date, int late_charge_fees) {
        this.id = id;
        this.book = book;
        this.reader_id = reader_id;
        this.pickup_date = pickup_date;
        this.due_date = due_date;
        this.return_date = return_date;
        this.late_charge_fees = late_charge_fees;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public UUID getReader_id() {
        return reader_id;
    }

    public void setReader_id(UUID reader_id) {
        this.reader_id = reader_id;
    }

    // Other getters and setters
}
