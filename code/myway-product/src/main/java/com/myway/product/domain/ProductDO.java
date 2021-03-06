package com.myway.product.domain;

public class ProductDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.category_id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbg.generated
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.stock
     *
     * @mbg.generated
     */
    private Double stock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.picture_url
     *
     * @mbg.generated
     */
    private String pictureUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.description
     *
     * @return the value of product.description
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.description
     *
     * @param description the value for product.description
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.category_id
     *
     * @return the value of product.category_id
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.category_id
     *
     * @param categoryId the value for product.category_id
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     * @mbg.generated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     * @mbg.generated
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.stock
     *
     * @return the value of product.stock
     * @mbg.generated
     */
    public Double getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.stock
     *
     * @param stock the value for product.stock
     * @mbg.generated
     */
    public void setStock(Double stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.picture_url
     *
     * @return the value of product.picture_url
     * @mbg.generated
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.picture_url
     *
     * @param pictureUrl the value for product.picture_url
     * @mbg.generated
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    @Override
    public String toString() {
        return "ProductDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", categoryId=" + categoryId +
                ", price=" + price +
                ", stock=" + stock +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }
}