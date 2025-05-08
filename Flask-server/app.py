from flask import Flask, request, jsonify

app = Flask(__name__)

# GET request handler
@app.route('/', methods=['GET'])
def home():
    return "<h1>Welcome to the Flask Web Server!</h1>", 200

# POST request handler
@app.route('/post', methods=['POST'])
def handle_post():
    data = request.json
    return jsonify({'message': 'Data received', 'data': data}), 200

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
