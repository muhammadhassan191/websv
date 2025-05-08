// Import required modules
const express = require('express');
const app = express();
const port = 3000;

// Middleware to parse JSON data
app.use(express.json());

// GET request handler
app.get('/', (req, res) => {
    res.send('<h1>Welcome to the Node.js Web Server!</h1>');
});

// POST request handler
app.post('/post', (req, res) => {
    const data = req.body;
    res.json({ message: 'Data received', data: data });
});

// Start the server
app.listen(port, () => {
    console.log(`Node.js server running on port ${port}...`);
});
