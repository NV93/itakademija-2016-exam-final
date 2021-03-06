var BookListContainer = React.createClass({
  getInitialState: function() {
    return { books: [] };
  },

  componentWillMount: function() {
    var self = this;
    axios.get('http://localhost:8080/api/books')
      .then(function (response) {
        self.setState({ books: response.data });
      })
  },

  render: function() {
    console.log("book_list_container props:");
    console.log(this);

    return <BookListComponent books={this.state.books} />
  }
});

window.BookListContainer = BookListContainer;
