/*
 * {{{ header & license
 * CSSName.java
 * Copyright (c) 2004 Patrick Wright
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 * }}}
 */
package org.xhtmlrenderer.css.constants;

import java.util.*;

import org.xhtmlrenderer.util.XRRuntimeException;


/**
 * A CSSName is a Singleton representing a single CSS property name, like
 * border-width. The class declares a Singleton static instance for each CSS
 * Level 2 property. A CSSName instance has the property name available from the
 * {@link #toString()} method, as well as a unique (among all CSSName instances)
 * integer id ranging from 0...n instances, incremented by 1, available using
 * the {@link #getAssignedID()} method.
 *
 * @author   Patrick Wright
 */
public final class CSSName {
    /** Description of the Field */
    private String propName;

    /** Description of the Field */
    private int assignedID;

    /** Constant string for CSS2 property. */
    public final static CSSName COLOR = addProperty( "color" );

    /** Constant string for CSS2 property. */
    public final static CSSName BACKGROUND_SHORTHAND = addProperty( "background" );

    /** Constant string for CSS2 property. */
    public final static CSSName BACKGROUND_COLOR = addProperty( "background-color" );

    /** Constant string for CSS2 property. */
    public final static CSSName BACKGROUND_IMAGE = addProperty( "background-image" );

    /** Constant string for CSS2 property. */
    public final static CSSName BACKGROUND_REPEAT = addProperty( "background-repeat" );

    /** Constant string for CSS2 property. */
    public final static CSSName BACKGROUND_ATTACHMENT = addProperty( "background-attachment" );

    /** Constant string for CSS2 property. */
    public final static CSSName BACKGROUND_POSITION = addProperty( "background-position" );

    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_COLLAPSE = addProperty( "border-collapse" );

    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_SPACING = addProperty( "border-spacing" );

    /** Constant string for CSS2 property. */
    public final static CSSName BOTTOM = addProperty( "bottom" );

    /** Constant string for CSS2 property. */
    public final static CSSName CAPTION_SIDE = addProperty( "caption-side" );

    /** Constant string for CSS2 property. */
    public final static CSSName CLEAR = addProperty( "clear" );

    /** Constant string for CSS2 property. */
    public final static CSSName CLIP = addProperty( "clip" );

    /** Constant string for CSS2 property. */
    public final static CSSName CONTENT = addProperty( "content" );

    /** Constant string for CSS2 property. */
    public final static CSSName COUNTER_INCREMENT = addProperty( "counter-increment" );

    /** Constant string for CSS2 property. */
    public final static CSSName COUNTER_RESET = addProperty( "counter-reset" );

    /** Constant string for CSS2 property. */
    public final static CSSName CURSOR = addProperty( "cursor" );

    /** Constant string for CSS2 property. */
    public final static CSSName DIRECTION = addProperty( "direction" );

    /** Constant string for CSS2 property. */
    public final static CSSName DISPLAY = addProperty( "display" );

    /** Constant string for CSS2 property. */
    public final static CSSName EMPTY_CELLS = addProperty( "empty-cells" );

    /** Constant string for CSS2 property. */
    public final static CSSName FLOAT = addProperty( "float" );

    /** Constant string for CSS2 property. */
    public final static CSSName FONT_SHORTHAND = addProperty( "font" );

    /** Constant string for CSS2 property. */
    public final static CSSName FONT_STYLE = addProperty( "font-style" );

    /** Constant string for CSS2 property. */
    public final static CSSName FONT_VARIANT = addProperty( "font-variant" );

    /** Constant string for CSS2 property. */
    public final static CSSName FONT_WEIGHT = addProperty( "font-weight" );

    /** Constant string for CSS2 property. */
    public final static CSSName FONT_SIZE = addProperty( "font-size" );

    /** Constant string for CSS2 property. */
    public final static CSSName LINE_HEIGHT = addProperty( "line-height" );

    /** Constant string for CSS2 property. */
    public final static CSSName FONT_FAMILY = addProperty( "font-family" );

    /** Constant string for CSS2 property. */
    public final static CSSName FONT_SIZE_ADJUST = addProperty( "font-size-adjust" );

    /** Constant string for CSS2 property. */
    public final static CSSName FONT_STRETCH = addProperty( "font-stretch" );

    /** Constant string for CSS2 property. */
    public final static CSSName HEIGHT = addProperty( "height" );

    /** Constant string for CSS2 property. */
    public final static CSSName LEFT = addProperty( "left" );

    /** Constant string for CSS2 property. */
    public final static CSSName LETTER_SPACING = addProperty( "letter-spacing" );

    /** Constant string for CSS2 property. */
    public final static CSSName LIST_STYLE_SHORTHAND = addProperty( "list-style" );

    /** Constant string for CSS2 property. */
    public final static CSSName LIST_STYLE_TYPE = addProperty( "list-style-type" );

    /** Constant string for CSS2 property. */
    public final static CSSName LIST_STYLE_POSITION = addProperty( "list-style-position" );

    /** Constant string for CSS2 property. */
    public final static CSSName LIST_STYLE_IMAGE = addProperty( "list-style-image" );

    /** Constant string for CSS2 property. */
    public final static CSSName MARKER_OFFSET = addProperty( "marker-offset" );

    /** Constant string for CSS2 property. */
    public final static CSSName MARKS = addProperty( "marks" );

    /** Constant string for CSS2 property. */
    public final static CSSName MAX_HEIGHT = addProperty( "max-height" );

    /** Constant string for CSS2 property. */
    public final static CSSName MAX_WIDTH = addProperty( "max-width" );

    /** Constant string for CSS2 property. */
    public final static CSSName MIN_HEIGHT = addProperty( "min-height" );

    /** Constant string for CSS2 property. */
    public final static CSSName MIN_WIDTH = addProperty( "min-width" );

    /** Constant string for CSS2 property. */
    public final static CSSName ORPHANS = addProperty( "orphans" );

    /** Constant string for CSS2 property. */
    public final static CSSName OUTLINE_SHORTHAND = addProperty( "outline" );

    /** Constant string for CSS2 property. */
    public final static CSSName OUTLINE_COLOR = addProperty( "outline-color" );

    /** Constant string for CSS2 property. */
    public final static CSSName OUTLINE_STYLE = addProperty( "outline-style" );

    /** Constant string for CSS2 property. */
    public final static CSSName OUTLINE_WIDTH = addProperty( "outline-width" );

    /** Constant string for CSS2 property. */
    public final static CSSName OVERFLOW = addProperty( "overflow" );

    /** Constant string for CSS2 property. */
    public final static CSSName PAGE = addProperty( "page" );

    /** Constant string for CSS2 property. */
    public final static CSSName PAGE_BREAK_AFTER = addProperty( "page-break-after" );

    /** Constant string for CSS2 property. */
    public final static CSSName PAGE_BREAK_BEFORE = addProperty( "page-break-before" );

    /** Constant string for CSS2 property. */
    public final static CSSName PAGE_BREAK_INSIDE = addProperty( "page-break-inside" );

    /** Constant string for CSS2 property. */
    public final static CSSName POSITION = addProperty( "position" );

    /** Constant string for CSS2 property. */
    public final static CSSName QUOTES = addProperty( "quotes" );

    /** Constant string for CSS2 property. */
    public final static CSSName RIGHT = addProperty( "right" );

    /** Constant string for CSS2 property. */
    public final static CSSName SIZE = addProperty( "size" );

    /** Constant string for CSS2 property. */
    public final static CSSName TABLE_LAYOUT = addProperty( "table-layout" );

    /** Constant string for CSS2 property. */
    public final static CSSName TEXT_ALIGN = addProperty( "text-align" );

    /** Constant string for CSS2 property. */
    public final static CSSName TEXT_DECORATION = addProperty( "text-decoration" );

    /** Constant string for CSS2 property. */
    public final static CSSName TEXT_INDENT = addProperty( "text-indent" );

    /** Constant string for CSS2 property. */
    public final static CSSName TEXT_SHADOW = addProperty( "text-shadow" );

    /** Constant string for CSS2 property. */
    public final static CSSName TEXT_TRANSFORM = addProperty( "text-transform" );

    /** Constant string for CSS2 property. */
    public final static CSSName TOP = addProperty( "top" );

    /** Constant string for CSS2 property. */
    public final static CSSName UNICODE_BIDI = addProperty( "unicode-bidi" );

    /** Constant string for CSS2 property. */
    public final static CSSName VERTICAL_ALIGN = addProperty( "vertical-align" );

    /** Constant string for CSS2 property. */
    public final static CSSName VISIBILITY = addProperty( "visibility" );

    /** Constant string for CSS2 property. */
    public final static CSSName WHITE_SPACE = addProperty( "white-space" );

    /** Constant string for CSS2 property. */
    public final static CSSName WIDOWS = addProperty( "widows" );

    /** Constant string for CSS2 property. */
    public final static CSSName WIDTH = addProperty( "width" );

    /** Constant string for CSS2 property. */
    public final static CSSName WORD_SPACING = addProperty( "word-spacing" );

    /** Constant string for CSS2 property. */
    public final static CSSName Z_INDEX = addProperty( "z-index" );

    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_SHORTHAND = addProperty( "border" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_TOP_SHORTHAND = addProperty( "border-top" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_RIGHT_SHORTHAND = addProperty( "border-right" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_BOTTOM_SHORTHAND = addProperty( "border-bottom" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_LEFT_SHORTHAND = addProperty( "border-left" );

    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_COLOR_SHORTHAND = addProperty( "border-color" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_COLOR_TOP = addProperty( "border-top-color" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_COLOR_RIGHT = addProperty( "border-right-color" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_COLOR_BOTTOM = addProperty( "border-bottom-color" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_COLOR_LEFT = addProperty( "border-left-color" );

    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_STYLE_SHORTHAND = addProperty( "border-style" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_STYLE_TOP = addProperty( "border-top-style" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_STYLE_RIGHT = addProperty( "border-right-style" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_STYLE_BOTTOM = addProperty( "border-bottom-style" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_STYLE_LEFT = addProperty( "border-left-style" );

    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_WIDTH_SHORTHAND = addProperty( "border-width" );

    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_WIDTH_TOP = addProperty( "border-top-width" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_WIDTH_RIGHT = addProperty( "border-right-width" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_WIDTH_BOTTOM = addProperty( "border-bottom-width" );
    /** Constant string for CSS2 property. */
    public final static CSSName BORDER_WIDTH_LEFT = addProperty( "border-left-width" );

    /** Constant string for CSS2 property. */
    public final static CSSName MARGIN_SHORTHAND = addProperty( "margin" );
    /** Constant string for CSS2 property. */
    public final static CSSName MARGIN_TOP = addProperty( "margin-top" );
    /** Constant string for CSS2 property. */
    public final static CSSName MARGIN_RIGHT = addProperty( "margin-right" );
    /** Constant string for CSS2 property. */
    public final static CSSName MARGIN_BOTTOM = addProperty( "margin-bottom" );
    /** Constant string for CSS2 property. */
    public final static CSSName MARGIN_LEFT = addProperty( "margin-left" );

    /** Constant string for CSS2 property. */
    public final static CSSName PADDING_SHORTHAND = addProperty( "padding" );
    /** Constant string for CSS2 property. */
    public final static CSSName PADDING_TOP = addProperty( "padding-top" );
    /** Constant string for CSS2 property. */
    public final static CSSName PADDING_RIGHT = addProperty( "padding-right" );
    /** Constant string for CSS2 property. */
    public final static CSSName PADDING_BOTTOM = addProperty( "padding-bottom" );
    /** Constant string for CSS2 property. */
    public final static CSSName PADDING_LEFT = addProperty( "padding-left" );
    /** Description of the Field */
    private static int maxAssigned;
    /** Description of the Field */
    private final static Comparator CSSNAME_COMPARATOR =
        new Comparator() {
            public int compare( Object o, Object o1 ) {
                return ( (CSSName)o ).toString().compareTo( ( (CSSName)o1 ).toString() );
            }
        };
    /** Constant string for CSS2 property. */
    private static Map ALL_PROPERTY_NAMES;
    /** Constant string for CSS2 property. */
    private final static List DEFAULT_INHERITABLE;// static block at bottom of class

    /**
     * Map of property names to initial values, per property, as defined by CSS
     * Spec.
     */
    private final static Map INITIAL_VALUE_MAP;


    /**
     * Constructor for the CSSName object
     *
     * @param propName  PARAM
     */
    private CSSName( String propName ) {
        try {
            this.propName = propName;
            this.assignedID = CSSName.maxAssigned++;
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }

    }

    /**
     * Returns a string representation of the object, in this case, always the
     * full CSS property name in lowercase.
     *
     * @return   a string representation of the object.
     */
    public String toString() {
        return this.propName;
    }

    /**
     * Returns the unique int ID assigned to this instance of a CSSName.
     * Instances are Singletons and numbered starting at 0, incrementally by 1.
     *
     * @return   The unique integer id for the CSSName instance.
     */
    public int getAssignedID() {
        return assignedID;
    }

    /**
     * Description of the Method
     *
     * @return   Returns
     */
    public final static int countCSSNames() {
        return CSSName.maxAssigned;
    }

    /**
     * Iterator of ALL CSS 2 visual property names.
     *
     * @return   Returns
     */
    public final static Iterator allCSS2PropertyNames() {
        return ALL_PROPERTY_NAMES.keySet().iterator();
    }

    /**
     * Returns true if the named property inherits by default, according to the
     * CSS2 spec.
     *
     * @param cssName  PARAM
     * @return         Returns
     */
    public final static boolean propertyInherits( CSSName cssName ) {
        return DEFAULT_INHERITABLE.contains( cssName );
    }

    /**
     * Returns the initial value of the named property, according to the CSS2
     * spec, as a String. Casting must be taken care of by the caller, as there
     * is too much variation in value-types.
     *
     * @param cssName  PARAM
     * @return         Returns
     */
    public final static String initialValue( CSSName cssName ) {
        return (String)INITIAL_VALUE_MAP.get( cssName );
    }

    /**
     * Gets the byPropertyName attribute of the CSSName class
     *
     * @param propName  PARAM
     * @return          The byPropertyName value
     */
    public static CSSName getByPropertyName( String propName ) {
        CSSName cssName = (CSSName)ALL_PROPERTY_NAMES.get( propName );
        if ( cssName == null ) {
            throw new XRRuntimeException( "Property name " + propName + " has no CSSName instance assigned to it." );
        }
        return cssName;
    }

    /**
     * Gets the comparator attribute of the CSSName class
     *
     * @return   The comparator value
     */
    public static Comparator getComparator() {
        return CSSNAME_COMPARATOR;
    }

    /**
     * Adds a feature to the Property attribute of the CSSName class
     *
     * @param propName  The feature to be added to the Property attribute
     * @return          Returns
     */
    private final static synchronized CSSName addProperty( String propName ) {
        if ( ALL_PROPERTY_NAMES == null ) {
            ALL_PROPERTY_NAMES = new TreeMap();
        }
        CSSName cssName = new CSSName( propName );
        ALL_PROPERTY_NAMES.put( propName, cssName );
        return cssName;
    }

    static {
        DEFAULT_INHERITABLE = new ArrayList();
        DEFAULT_INHERITABLE.add( BORDER_COLLAPSE );
        DEFAULT_INHERITABLE.add( BORDER_SPACING );
        DEFAULT_INHERITABLE.add( CAPTION_SIDE );
        DEFAULT_INHERITABLE.add( COLOR );
        DEFAULT_INHERITABLE.add( CURSOR );
        DEFAULT_INHERITABLE.add( DIRECTION );
        DEFAULT_INHERITABLE.add( EMPTY_CELLS );
        DEFAULT_INHERITABLE.add( FONT_SHORTHAND );
        DEFAULT_INHERITABLE.add( FONT_FAMILY );
        DEFAULT_INHERITABLE.add( FONT_SIZE );
        DEFAULT_INHERITABLE.add( FONT_SIZE_ADJUST );
        DEFAULT_INHERITABLE.add( FONT_STRETCH );
        DEFAULT_INHERITABLE.add( FONT_STYLE );
        DEFAULT_INHERITABLE.add( FONT_VARIANT );
        DEFAULT_INHERITABLE.add( FONT_WEIGHT );
        DEFAULT_INHERITABLE.add( LETTER_SPACING );
        DEFAULT_INHERITABLE.add( LINE_HEIGHT );
        DEFAULT_INHERITABLE.add( LIST_STYLE_SHORTHAND );
        DEFAULT_INHERITABLE.add( LIST_STYLE_IMAGE );
        DEFAULT_INHERITABLE.add( LIST_STYLE_POSITION );
        DEFAULT_INHERITABLE.add( LIST_STYLE_TYPE );
        DEFAULT_INHERITABLE.add( ORPHANS );
        DEFAULT_INHERITABLE.add( PAGE );
        DEFAULT_INHERITABLE.add( PAGE_BREAK_INSIDE );
        DEFAULT_INHERITABLE.add( POSITION );
        DEFAULT_INHERITABLE.add( QUOTES );
        DEFAULT_INHERITABLE.add( PAGE_BREAK_INSIDE );
        DEFAULT_INHERITABLE.add( TEXT_ALIGN );
        DEFAULT_INHERITABLE.add( TEXT_INDENT );
        DEFAULT_INHERITABLE.add( TEXT_TRANSFORM );
        DEFAULT_INHERITABLE.add( WHITE_SPACE );
        DEFAULT_INHERITABLE.add( WIDOWS );
        DEFAULT_INHERITABLE.add( WORD_SPACING );

        INITIAL_VALUE_MAP = new HashMap();
        INITIAL_VALUE_MAP.put( BACKGROUND_ATTACHMENT, "scroll" );
        INITIAL_VALUE_MAP.put( BACKGROUND_COLOR, "transparent" );
        INITIAL_VALUE_MAP.put( BACKGROUND_IMAGE, "none" );
        INITIAL_VALUE_MAP.put( BACKGROUND_POSITION, "0% 0%" );
        INITIAL_VALUE_MAP.put( BACKGROUND_REPEAT, "repeat" );

        INITIAL_VALUE_MAP.put( BORDER_COLLAPSE, "collapse" );

        INITIAL_VALUE_MAP.put( BORDER_COLOR_TOP, "black" );
        INITIAL_VALUE_MAP.put( BORDER_COLOR_RIGHT, "black" );
        INITIAL_VALUE_MAP.put( BORDER_COLOR_BOTTOM, "black" );
        INITIAL_VALUE_MAP.put( BORDER_COLOR_LEFT, "black" );

        INITIAL_VALUE_MAP.put( BORDER_SPACING, "0px" );

        INITIAL_VALUE_MAP.put( BORDER_STYLE_SHORTHAND, "none" );// CLEAN, normally don't assign value for shorthand but code for B.S. is not side-specific yet (PWW 24-08-04)

        INITIAL_VALUE_MAP.put( BORDER_STYLE_TOP, "none" );
        INITIAL_VALUE_MAP.put( BORDER_STYLE_RIGHT, "none" );
        INITIAL_VALUE_MAP.put( BORDER_STYLE_BOTTOM, "none" );
        INITIAL_VALUE_MAP.put( BORDER_STYLE_LEFT, "none" );

        INITIAL_VALUE_MAP.put( BORDER_WIDTH_TOP, "medium" );
        INITIAL_VALUE_MAP.put( BORDER_WIDTH_RIGHT, "medium" );
        INITIAL_VALUE_MAP.put( BORDER_WIDTH_BOTTOM, "medium" );
        INITIAL_VALUE_MAP.put( BORDER_WIDTH_LEFT, "medium" );

        INITIAL_VALUE_MAP.put( BOTTOM, "auto" );

        INITIAL_VALUE_MAP.put( CAPTION_SIDE, "top" );
        INITIAL_VALUE_MAP.put( CLEAR, "none" );
        INITIAL_VALUE_MAP.put( CLIP, "auto" );

        INITIAL_VALUE_MAP.put( COLOR, "black" );// TODO: UA dependent

        INITIAL_VALUE_MAP.put( CONTENT, "" );

        INITIAL_VALUE_MAP.put( COUNTER_INCREMENT, "none" );
        INITIAL_VALUE_MAP.put( COUNTER_RESET, "none" );

        INITIAL_VALUE_MAP.put( CURSOR, "auto" );

        INITIAL_VALUE_MAP.put( DIRECTION, "ltr" );

        INITIAL_VALUE_MAP.put( DISPLAY, "inline" );

        INITIAL_VALUE_MAP.put( EMPTY_CELLS, "show" );

        INITIAL_VALUE_MAP.put( FLOAT, "none" );

        INITIAL_VALUE_MAP.put( FONT_FAMILY, "\"Times New Roman\"" );
        INITIAL_VALUE_MAP.put( FONT_SIZE, "medium" );
        INITIAL_VALUE_MAP.put( FONT_SIZE_ADJUST, "none" );
        INITIAL_VALUE_MAP.put( FONT_STRETCH, "normal" );
        INITIAL_VALUE_MAP.put( FONT_STYLE, "normal" );
        INITIAL_VALUE_MAP.put( FONT_VARIANT, "normal" );
        INITIAL_VALUE_MAP.put( FONT_WEIGHT, "normal" );

        INITIAL_VALUE_MAP.put( HEIGHT, "auto" );

        INITIAL_VALUE_MAP.put( LEFT, "auto" );

        INITIAL_VALUE_MAP.put( LETTER_SPACING, "normal" );
        INITIAL_VALUE_MAP.put( LINE_HEIGHT, "normal" );

        INITIAL_VALUE_MAP.put( LIST_STYLE_IMAGE, "none" );
        INITIAL_VALUE_MAP.put( LIST_STYLE_POSITION, "outside" );
        INITIAL_VALUE_MAP.put( LIST_STYLE_TYPE, "disc" );

        INITIAL_VALUE_MAP.put( MARGIN_TOP, "0px" );
        INITIAL_VALUE_MAP.put( MARGIN_RIGHT, "0px" );
        INITIAL_VALUE_MAP.put( MARGIN_BOTTOM, "0px" );
        INITIAL_VALUE_MAP.put( MARGIN_LEFT, "0px" );

        INITIAL_VALUE_MAP.put( MARKER_OFFSET, "auto" );
        INITIAL_VALUE_MAP.put( MARKS, "none" );

        INITIAL_VALUE_MAP.put( MAX_HEIGHT, "none" );
        INITIAL_VALUE_MAP.put( MIN_HEIGHT, "0" );
        INITIAL_VALUE_MAP.put( MAX_WIDTH, "none" );
        INITIAL_VALUE_MAP.put( MIN_WIDTH, "0" );// TODO: UA dependent

        INITIAL_VALUE_MAP.put( ORPHANS, "2" );

        INITIAL_VALUE_MAP.put( OUTLINE_COLOR, "invert" );
        INITIAL_VALUE_MAP.put( OUTLINE_STYLE, "none" );
        INITIAL_VALUE_MAP.put( OUTLINE_WIDTH, "medium" );

        INITIAL_VALUE_MAP.put( OVERFLOW, "visible" );

        INITIAL_VALUE_MAP.put( PADDING_TOP, "0px" );
        INITIAL_VALUE_MAP.put( PADDING_RIGHT, "0px" );
        INITIAL_VALUE_MAP.put( PADDING_BOTTOM, "0px" );
        INITIAL_VALUE_MAP.put( PADDING_LEFT, "0px" );

        INITIAL_VALUE_MAP.put( PAGE, "auto" );
        INITIAL_VALUE_MAP.put( PAGE_BREAK_AFTER, "auto" );
        INITIAL_VALUE_MAP.put( PAGE_BREAK_BEFORE, "auto" );
        INITIAL_VALUE_MAP.put( PAGE_BREAK_INSIDE, "auto" );

        INITIAL_VALUE_MAP.put( POSITION, "static" );
        INITIAL_VALUE_MAP.put( QUOTES, "none" );// TODO: UA dependent

        INITIAL_VALUE_MAP.put( RIGHT, "auto" );
        INITIAL_VALUE_MAP.put( SIZE, "auto" );

        INITIAL_VALUE_MAP.put( TABLE_LAYOUT, "auto" );

        INITIAL_VALUE_MAP.put( TEXT_ALIGN, "left" );// TODO: UA dependent
        INITIAL_VALUE_MAP.put( TEXT_DECORATION, "none" );
        INITIAL_VALUE_MAP.put( TEXT_INDENT, "0px" );
        INITIAL_VALUE_MAP.put( TEXT_SHADOW, "none" );
        INITIAL_VALUE_MAP.put( TEXT_TRANSFORM, "none" );

        INITIAL_VALUE_MAP.put( UNICODE_BIDI, "normal" );
        INITIAL_VALUE_MAP.put( VERTICAL_ALIGN, "baseline" );

        INITIAL_VALUE_MAP.put( VISIBILITY, "inherit" );

        INITIAL_VALUE_MAP.put( WHITE_SPACE, "normal" );
        INITIAL_VALUE_MAP.put( WIDOWS, "2" );
        INITIAL_VALUE_MAP.put( WIDTH, "auto" );
        INITIAL_VALUE_MAP.put( WORD_SPACING, "normal" );
        INITIAL_VALUE_MAP.put( Z_INDEX, "auto" );
    }
}

/*
 * $Id$
 *
 * $Log$
 * Revision 1.4  2005/01/29 16:05:30  pdoubleya
 * Fixed error on static initializer; maxAssigned was assigned 0 in declaration, preventing modification afterwards.
 *
 * Revision 1.3  2005/01/24 19:01:07  pdoubleya
 * Mass checkin. Changed to use references to CSSName, which now has a Singleton instance for each property, everywhere property names were being used before. Removed commented code. Cascaded and Calculated style now store properties in arrays rather than maps, for optimization.
 *
 * Revision 1.2  2004/10/23 13:09:13  pdoubleya
 * Re-formatted using JavaStyle tool.
 * Cleaned imports to resolve wildcards
 * except for common packages
 * (java.io, java.util, etc).
 * Added CVS log comments at bottom.
 *
 *
 */

