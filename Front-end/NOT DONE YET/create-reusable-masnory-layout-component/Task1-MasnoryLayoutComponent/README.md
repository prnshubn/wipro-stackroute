# Develop, Test and Publish Angular Component to npm registry


## Task 1

1. Develop Masonry Grid Container component that gives the flexibility to input text or images.
2. Publish it on NPM Registry (Npmjs.com).

**Masonry Grid Layout**

Masonry is a type of grid with a set of columns and fixed column width. The masonry container layout divides a page into columns and places all the items under it. The Masonry layout is one of the most popular layouts today. We can see the use of masonry layout in [Pintrest.com](http://pinterest.com). It is used for both image and text-based data.

A Masonry layout component gives you the flexibility required for the page. It takes the following as input:

- No. of Columns
- Column Width
- Total width of the layout
- Gutter - gap between two elements in layout


## Instructions

1. Create Component Project Library
2. Create Component Module
3. Create and Add Masonry Grid Component to Component Module
4. Build the library project
5. Test the component locally
6. Publish the component package to npm registry

## Troubleshooting FAQs

| Category                | Error                       | Error Responses                                                                                                         | Suggested   Solutions                                                                                                                          |
|-------------------------|-----------------------------|-------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------|
| Package   Publish Error | npm publish command   fails | 503 - service   unavailable                                                                                             | 1. Commands should be   running with administrator privileges                                                                                  |
|                         |                             |                                                                                                                         | - For linux/ubuntu   systems: use `sudo` before the command                                                                                    |
|                         |                             |                                                                                                                         | - For Windows   systems: run the command terminal with `admin` privileges                                                                      |
|                         |                             | 404 -Not found                                                                                                          | 1. need to login with   npm prior to npm publish using the command `npm login`                                                                 |
|                         |                             | 402 - Payment   Required                                                                                                | 1. Publish package   with public score using the command ` npm publish --access public`                                                        |
|                         |                             | 403   - Forbidden      You cannot publish over the previously published versions: 0.0.1                                 | 1. Increment the   version in package.json file and republish                                                                                  |
|                         |                             | 403   - Forbidden      <package-name> cannot be republished until 24 hours have passed.                                 | 1. Try publishing   after 24 hours or publish with a new package name                                                                          |
|                         |                             | 403   - Forbidden      You do not have permission to publish "grid-container". Are you   logged in as the correct user? | 1.   You are possibly using the package name that already exists in package   registry, try with a unique name, preferrably with a scoped name |



