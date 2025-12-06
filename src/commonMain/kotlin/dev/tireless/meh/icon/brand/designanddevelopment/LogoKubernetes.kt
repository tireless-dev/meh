package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoKubernetes: ImageVector
    get() {
        val current = _logoKubernetes
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoKubernetes",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="15.134 17.189 15.999 17.605 16.862 17.19 17.076 16.259 16.479 15.512 15.518 15.512 14.919 16.257 15.134 17.189" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15.134 17.189
                moveTo(x = 15.134f, y = 17.189f)
                // L 15.999 17.605
                lineTo(x = 15.999f, y = 17.605f)
                // L 16.862 17.19
                lineTo(x = 16.862f, y = 17.19f)
                // L 17.076 16.259
                lineTo(x = 17.076f, y = 16.259f)
                // L 16.479 15.512
                lineTo(x = 16.479f, y = 15.512f)
                // L 15.518 15.512
                lineTo(x = 15.518f, y = 15.512f)
                // L 14.919 16.257
                lineTo(x = 14.919f, y = 16.257f)
                // L 15.134 17.189z
                lineTo(x = 15.134f, y = 17.189f)
                close()
            }
            // M14.22 13.88 a.52 .52 0 0 0 .83 -.4 h.01 l.18 -3.15 -.63 .1 a6 6 0 0 0 -2.97 1.63z m-1.39 2.38 a.52 .52 0 0 0 .21 -.9 v-.01 l-2.35 -2.1 a6.2 6.2 0 0 0 -.87 3.9 l3.01 -.88Z m1.03 2.24 a.5 .5 0 0 0 -.6 -.4 h-.01 l-3.09 .52 a6.2 6.2 0 0 0 2.49 3.11 l1.2 -2.9 h-.02 a.5 .5 0 0 0 .03 -.33 m2.6 1.14 a.5 .5 0 0 0 -.48 -.28 .5 .5 0 0 0 -.44 .28 L14 22.4 a6 6 0 0 0 3.38 .17 L18 22.4 l-1.52 -2.76Z m2.28 -1.55 H18.6 a.53 .53 0 0 0 -.45 .72 v.01 l1.2 2.92 a6.2 6.2 0 0 0 2.5 -3.13z m2.55 -4.85 -2.34 2.1 a.52 .52 0 0 0 .2 .9 l.01 .02 3.03 .87 a6.3 6.3 0 0 0 -.9 -3.89 m-4.35 .23 a.5 .5 0 0 0 .11 .3 .5 .5 0 0 0 .72 .1 h.01 l2.56 -1.81 a6.2 6.2 0 0 0 -3.58 -1.73z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14.22 13.88
                moveTo(x = 14.22f, y = 13.88f)
                // a 0.52 0.52 0 0 0 0.83 -0.4
                arcToRelative(
                    a = 0.52f,
                    b = 0.52f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.83f,
                    dy1 = -0.4f,
                )
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // l 0.18 -3.15
                lineToRelative(dx = 0.18f, dy = -3.15f)
                // l -0.63 0.1
                lineToRelative(dx = -0.63f, dy = 0.1f)
                // a 6 6 0 0 0 -2.97 1.63z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.97f,
                    dy1 = 1.63f,
                )
                close()
                // m -1.39 2.38
                moveToRelative(dx = -1.39f, dy = 2.38f)
                // a 0.52 0.52 0 0 0 0.21 -0.9
                arcToRelative(
                    a = 0.52f,
                    b = 0.52f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.21f,
                    dy1 = -0.9f,
                )
                // v -0.01
                verticalLineToRelative(dy = -0.01f)
                // l -2.35 -2.1
                lineToRelative(dx = -2.35f, dy = -2.1f)
                // a 6.2 6.2 0 0 0 -0.87 3.9
                arcToRelative(
                    a = 6.2f,
                    b = 6.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.87f,
                    dy1 = 3.9f,
                )
                // l 3.01 -0.88z
                lineToRelative(dx = 3.01f, dy = -0.88f)
                close()
                // m 1.03 2.24
                moveToRelative(dx = 1.03f, dy = 2.24f)
                // a 0.5 0.5 0 0 0 -0.6 -0.4
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.6f,
                    dy1 = -0.4f,
                )
                // h -0.01
                horizontalLineToRelative(dx = -0.01f)
                // l -3.09 0.52
                lineToRelative(dx = -3.09f, dy = 0.52f)
                // a 6.2 6.2 0 0 0 2.49 3.11
                arcToRelative(
                    a = 6.2f,
                    b = 6.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.49f,
                    dy1 = 3.11f,
                )
                // l 1.2 -2.9
                lineToRelative(dx = 1.2f, dy = -2.9f)
                // h -0.02
                horizontalLineToRelative(dx = -0.02f)
                // a 0.5 0.5 0 0 0 0.03 -0.33
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.03f,
                    dy1 = -0.33f,
                )
                // m 2.6 1.14
                moveToRelative(dx = 2.6f, dy = 1.14f)
                // a 0.5 0.5 0 0 0 -0.48 -0.28
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.48f,
                    dy1 = -0.28f,
                )
                // a 0.5 0.5 0 0 0 -0.44 0.28
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.44f,
                    dy1 = 0.28f,
                )
                // L 14 22.4
                lineTo(x = 14.0f, y = 22.4f)
                // a 6 6 0 0 0 3.38 0.17
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.38f,
                    dy1 = 0.17f,
                )
                // L 18 22.4
                lineTo(x = 18.0f, y = 22.4f)
                // l -1.52 -2.76z
                lineToRelative(dx = -1.52f, dy = -2.76f)
                close()
                // m 2.28 -1.55
                moveToRelative(dx = 2.28f, dy = -1.55f)
                // H 18.6
                horizontalLineTo(x = 18.6f)
                // a 0.53 0.53 0 0 0 -0.45 0.72
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.45f,
                    dy1 = 0.72f,
                )
                // v 0.01
                verticalLineToRelative(dy = 0.01f)
                // l 1.2 2.92
                lineToRelative(dx = 1.2f, dy = 2.92f)
                // a 6.2 6.2 0 0 0 2.5 -3.13z
                arcToRelative(
                    a = 6.2f,
                    b = 6.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.5f,
                    dy1 = -3.13f,
                )
                close()
                // m 2.55 -4.85
                moveToRelative(dx = 2.55f, dy = -4.85f)
                // l -2.34 2.1
                lineToRelative(dx = -2.34f, dy = 2.1f)
                // a 0.52 0.52 0 0 0 0.2 0.9
                arcToRelative(
                    a = 0.52f,
                    b = 0.52f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.2f,
                    dy1 = 0.9f,
                )
                // l 0.01 0.02
                lineToRelative(dx = 0.01f, dy = 0.02f)
                // l 3.03 0.87
                lineToRelative(dx = 3.03f, dy = 0.87f)
                // a 6.3 6.3 0 0 0 -0.9 -3.89
                arcToRelative(
                    a = 6.3f,
                    b = 6.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = -3.89f,
                )
                // m -4.35 0.23
                moveToRelative(dx = -4.35f, dy = 0.23f)
                // a 0.5 0.5 0 0 0 0.11 0.3
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.11f,
                    dy1 = 0.3f,
                )
                // a 0.5 0.5 0 0 0 0.72 0.1
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.72f,
                    dy1 = 0.1f,
                )
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // l 2.56 -1.81
                lineToRelative(dx = 2.56f, dy = -1.81f)
                // a 6.2 6.2 0 0 0 -3.58 -1.73z
                arcToRelative(
                    a = 6.2f,
                    b = 6.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.58f,
                    dy1 = -1.73f,
                )
                close()
            }
            // M30.38 19.04 27.9 8.27 a1.9 1.9 0 0 0 -1.04 -1.29 l-10.03 -4.8 a2 2 0 0 0 -1.67 0 L5.13 6.99 a1.9 1.9 0 0 0 -1.04 1.3 L1.62 19.03 a2 2 0 0 0 .26 1.46 l.1 .15 6.95 8.63 a2 2 0 0 0 1.5 .72 h11.14 a2 2 0 0 0 1.5 -.72 L30 20.65 a1.9 1.9 0 0 0 .37 -1.61 m-3.81 -.13 a.64 .64 0 0 1 -.78 .44 h-.02 l-.06 -.02 -.1 -.02 -.36 -.13 -.18 -.08 h-.01 a6 6 0 0 0 -1.03 -.3 .4 .4 0 0 0 -.3 .1 l-.04 .02 -.25 -.04 a7.8 7.8 0 0 1 -3.46 4.35 L20 23.3 l.07 .16 -.02 .04 a.4 .4 0 0 0 -.03 .31 6 6 0 0 0 .53 .95 l.12 .16 .2 .32 .06 .12 .02 .04 a.6 .6 0 1 1 -1.1 .52 l-.01 -.04 -.06 -.11 -.12 -.37 -.05 -.18 V25.2 a6 6 0 0 0 -.41 -1 .4 .4 0 0 0 -.26 -.16 l-.05 -.02 -.06 -.1 -.06 -.12 a8 8 0 0 1 -1.03 .3 7.8 7.8 0 0 1 -4.51 -.32 l-.14 .25 a.5 .5 0 0 0 -.25 .12 2 2 0 0 0 -.34 .72 l-.13 .36 -.05 .19 -.12 .36 -.05 .1 -.03 .05 a.7 .7 0 0 1 -.6 .4 1 1 0 0 1 -.23 -.06 .64 .64 0 0 1 -.26 -.86 l.03 -.05 .05 -.1 .2 -.33 .12 -.16 a6 6 0 0 0 .54 -.97 .6 .6 0 0 0 -.05 -.34 l.1 -.26 a7.8 7.8 0 0 1 -3.45 -4.32 l-.26 .04 -.03 -.01 a1 1 0 0 0 -.32 -.1 6 6 0 0 0 -1.03 .3 H6.93 l-.18 .07 -.36 .14 -.11 .02 -.05 .01 H6.22 a.6 .6 0 1 1 -.28 -1.17 h.01 L6 18.16 l.12 -.02 .38 -.04 .2 -.01 a6 6 0 0 0 1.07 -.18 A1 1 0 0 0 8 17.69 l.03 -.03 .24 -.07 a7.8 7.8 0 0 1 1.23 -5.41 L9.3 12 v-.03 a1 1 0 0 0 -.11 -.32 6 6 0 0 0 -.9 -.63 l-.16 -.1 -.33 -.19 -.09 -.07 -.03 -.03 H7.67 A.7 .7 0 0 1 7.4 10.2 a.6 .6 0 0 1 .12 -.46 A.6 .6 0 0 1 8 9.53 a.7 .7 0 0 1 .42 .16 l.04 .03 .1 .07 .26 .28 .13 .14 .01 .01 a6 6 0 0 0 .8 .72 .4 .4 0 0 0 .3 .05 l.05 -.01 .22 .15 a7.7 7.7 0 0 1 3.92 -2.24 8 8 0 0 1 1.08 -.17 l.02 -.25 a1 1 0 0 0 .2 -.3 6 6 0 0 0 -.07 -1.09 l-.04 -.2 L15.4 6.5 V6.33 a.6 .6 0 1 1 1.21 0 V6.5 l-.04 .38 -.04 .2 V7.1 a6 6 0 0 0 -.06 1.05 .4 .4 0 0 0 .16 .27 l.03 .03 .02 .27 a8 8 0 0 1 2.71 .75 8 8 0 0 1 2.27 1.65 l.22 -.16 h.04 a1 1 0 0 0 .33 -.04 6 6 0 0 0 .78 -.7 l.02 -.03 .13 -.14 .27 -.28 .1 -.08 .04 -.03 a.6 .6 0 1 1 .75 .95 l-.04 .04 -.1 .07 -.32 .2 -.17 .09 a6 6 0 0 0 -.9 .63 .4 .4 0 0 0 -.1 .29 v.04 l-.1 .09 q-.06 .06 -.12 .1 a7.8 7.8 0 0 1 1.25 5.4 l.24 .07 .02 .03 a1 1 0 0 0 .24 .23 6 6 0 0 0 1.06 .18 h.02 l.2 .01 .37 .04 .11 .02 .07 .02 a.64 .64 0 0 1 .5 .74
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30.38 19.04
                moveTo(x = 30.38f, y = 19.04f)
                // L 27.9 8.27
                lineTo(x = 27.9f, y = 8.27f)
                // a 1.9 1.9 0 0 0 -1.04 -1.29
                arcToRelative(
                    a = 1.9f,
                    b = 1.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.04f,
                    dy1 = -1.29f,
                )
                // l -10.03 -4.8
                lineToRelative(dx = -10.03f, dy = -4.8f)
                // a 2 2 0 0 0 -1.67 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.67f,
                    dy1 = 0.0f,
                )
                // L 5.13 6.99
                lineTo(x = 5.13f, y = 6.99f)
                // a 1.9 1.9 0 0 0 -1.04 1.3
                arcToRelative(
                    a = 1.9f,
                    b = 1.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.04f,
                    dy1 = 1.3f,
                )
                // L 1.62 19.03
                lineTo(x = 1.62f, y = 19.03f)
                // a 2 2 0 0 0 0.26 1.46
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.26f,
                    dy1 = 1.46f,
                )
                // l 0.1 0.15
                lineToRelative(dx = 0.1f, dy = 0.15f)
                // l 6.95 8.63
                lineToRelative(dx = 6.95f, dy = 8.63f)
                // a 2 2 0 0 0 1.5 0.72
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.5f,
                    dy1 = 0.72f,
                )
                // h 11.14
                horizontalLineToRelative(dx = 11.14f)
                // a 2 2 0 0 0 1.5 -0.72
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.5f,
                    dy1 = -0.72f,
                )
                // L 30 20.65
                lineTo(x = 30.0f, y = 20.65f)
                // a 1.9 1.9 0 0 0 0.37 -1.61
                arcToRelative(
                    a = 1.9f,
                    b = 1.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.37f,
                    dy1 = -1.61f,
                )
                // m -3.81 -0.13
                moveToRelative(dx = -3.81f, dy = -0.13f)
                // a 0.64 0.64 0 0 1 -0.78 0.44
                arcToRelative(
                    a = 0.64f,
                    b = 0.64f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.78f,
                    dy1 = 0.44f,
                )
                // h -0.02
                horizontalLineToRelative(dx = -0.02f)
                // l -0.06 -0.02
                lineToRelative(dx = -0.06f, dy = -0.02f)
                // l -0.1 -0.02
                lineToRelative(dx = -0.1f, dy = -0.02f)
                // l -0.36 -0.13
                lineToRelative(dx = -0.36f, dy = -0.13f)
                // l -0.18 -0.08
                lineToRelative(dx = -0.18f, dy = -0.08f)
                // h -0.01
                horizontalLineToRelative(dx = -0.01f)
                // a 6 6 0 0 0 -1.03 -0.3
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.03f,
                    dy1 = -0.3f,
                )
                // a 0.4 0.4 0 0 0 -0.3 0.1
                arcToRelative(
                    a = 0.4f,
                    b = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.3f,
                    dy1 = 0.1f,
                )
                // l -0.04 0.02
                lineToRelative(dx = -0.04f, dy = 0.02f)
                // l -0.25 -0.04
                lineToRelative(dx = -0.25f, dy = -0.04f)
                // a 7.8 7.8 0 0 1 -3.46 4.35
                arcToRelative(
                    a = 7.8f,
                    b = 7.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.46f,
                    dy1 = 4.35f,
                )
                // L 20 23.3
                lineTo(x = 20.0f, y = 23.3f)
                // l 0.07 0.16
                lineToRelative(dx = 0.07f, dy = 0.16f)
                // l -0.02 0.04
                lineToRelative(dx = -0.02f, dy = 0.04f)
                // a 0.4 0.4 0 0 0 -0.03 0.31
                arcToRelative(
                    a = 0.4f,
                    b = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.03f,
                    dy1 = 0.31f,
                )
                // a 6 6 0 0 0 0.53 0.95
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.53f,
                    dy1 = 0.95f,
                )
                // l 0.12 0.16
                lineToRelative(dx = 0.12f, dy = 0.16f)
                // l 0.2 0.32
                lineToRelative(dx = 0.2f, dy = 0.32f)
                // l 0.06 0.12
                lineToRelative(dx = 0.06f, dy = 0.12f)
                // l 0.02 0.04
                lineToRelative(dx = 0.02f, dy = 0.04f)
                // a 0.6 0.6 0 1 1 -1.1 0.52
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.1f,
                    dy1 = 0.52f,
                )
                // l -0.01 -0.04
                lineToRelative(dx = -0.01f, dy = -0.04f)
                // l -0.06 -0.11
                lineToRelative(dx = -0.06f, dy = -0.11f)
                // l -0.12 -0.37
                lineToRelative(dx = -0.12f, dy = -0.37f)
                // l -0.05 -0.18
                lineToRelative(dx = -0.05f, dy = -0.18f)
                // V 25.2
                verticalLineTo(y = 25.2f)
                // a 6 6 0 0 0 -0.41 -1
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.41f,
                    dy1 = -1.0f,
                )
                // a 0.4 0.4 0 0 0 -0.26 -0.16
                arcToRelative(
                    a = 0.4f,
                    b = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.26f,
                    dy1 = -0.16f,
                )
                // l -0.05 -0.02
                lineToRelative(dx = -0.05f, dy = -0.02f)
                // l -0.06 -0.1
                lineToRelative(dx = -0.06f, dy = -0.1f)
                // l -0.06 -0.12
                lineToRelative(dx = -0.06f, dy = -0.12f)
                // a 8 8 0 0 1 -1.03 0.3
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.03f,
                    dy1 = 0.3f,
                )
                // a 7.8 7.8 0 0 1 -4.51 -0.32
                arcToRelative(
                    a = 7.8f,
                    b = 7.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.51f,
                    dy1 = -0.32f,
                )
                // l -0.14 0.25
                lineToRelative(dx = -0.14f, dy = 0.25f)
                // a 0.5 0.5 0 0 0 -0.25 0.12
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.25f,
                    dy1 = 0.12f,
                )
                // a 2 2 0 0 0 -0.34 0.72
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.34f,
                    dy1 = 0.72f,
                )
                // l -0.13 0.36
                lineToRelative(dx = -0.13f, dy = 0.36f)
                // l -0.05 0.19
                lineToRelative(dx = -0.05f, dy = 0.19f)
                // l -0.12 0.36
                lineToRelative(dx = -0.12f, dy = 0.36f)
                // l -0.05 0.1
                lineToRelative(dx = -0.05f, dy = 0.1f)
                // l -0.03 0.05
                lineToRelative(dx = -0.03f, dy = 0.05f)
                // a 0.7 0.7 0 0 1 -0.6 0.4
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.6f,
                    dy1 = 0.4f,
                )
                // a 1 1 0 0 1 -0.23 -0.06
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.23f,
                    dy1 = -0.06f,
                )
                // a 0.64 0.64 0 0 1 -0.26 -0.86
                arcToRelative(
                    a = 0.64f,
                    b = 0.64f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.26f,
                    dy1 = -0.86f,
                )
                // l 0.03 -0.05
                lineToRelative(dx = 0.03f, dy = -0.05f)
                // l 0.05 -0.1
                lineToRelative(dx = 0.05f, dy = -0.1f)
                // l 0.2 -0.33
                lineToRelative(dx = 0.2f, dy = -0.33f)
                // l 0.12 -0.16
                lineToRelative(dx = 0.12f, dy = -0.16f)
                // a 6 6 0 0 0 0.54 -0.97
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.54f,
                    dy1 = -0.97f,
                )
                // a 0.6 0.6 0 0 0 -0.05 -0.34
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.05f,
                    dy1 = -0.34f,
                )
                // l 0.1 -0.26
                lineToRelative(dx = 0.1f, dy = -0.26f)
                // a 7.8 7.8 0 0 1 -3.45 -4.32
                arcToRelative(
                    a = 7.8f,
                    b = 7.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.45f,
                    dy1 = -4.32f,
                )
                // l -0.26 0.04
                lineToRelative(dx = -0.26f, dy = 0.04f)
                // l -0.03 -0.01
                lineToRelative(dx = -0.03f, dy = -0.01f)
                // a 1 1 0 0 0 -0.32 -0.1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.32f,
                    dy1 = -0.1f,
                )
                // a 6 6 0 0 0 -1.03 0.3
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.03f,
                    dy1 = 0.3f,
                )
                // H 6.93
                horizontalLineTo(x = 6.93f)
                // l -0.18 0.07
                lineToRelative(dx = -0.18f, dy = 0.07f)
                // l -0.36 0.14
                lineToRelative(dx = -0.36f, dy = 0.14f)
                // l -0.11 0.02
                lineToRelative(dx = -0.11f, dy = 0.02f)
                // l -0.05 0.01
                lineToRelative(dx = -0.05f, dy = 0.01f)
                // H 6.22
                horizontalLineTo(x = 6.22f)
                // a 0.6 0.6 0 1 1 -0.28 -1.17
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.28f,
                    dy1 = -1.17f,
                )
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // L 6 18.16
                lineTo(x = 6.0f, y = 18.16f)
                // l 0.12 -0.02
                lineToRelative(dx = 0.12f, dy = -0.02f)
                // l 0.38 -0.04
                lineToRelative(dx = 0.38f, dy = -0.04f)
                // l 0.2 -0.01
                lineToRelative(dx = 0.2f, dy = -0.01f)
                // a 6 6 0 0 0 1.07 -0.18
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.07f,
                    dy1 = -0.18f,
                )
                // A 1 1 0 0 0 8 17.69
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 17.69f,
                )
                // l 0.03 -0.03
                lineToRelative(dx = 0.03f, dy = -0.03f)
                // l 0.24 -0.07
                lineToRelative(dx = 0.24f, dy = -0.07f)
                // a 7.8 7.8 0 0 1 1.23 -5.41
                arcToRelative(
                    a = 7.8f,
                    b = 7.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.23f,
                    dy1 = -5.41f,
                )
                // L 9.3 12
                lineTo(x = 9.3f, y = 12.0f)
                // v -0.03
                verticalLineToRelative(dy = -0.03f)
                // a 1 1 0 0 0 -0.11 -0.32
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.11f,
                    dy1 = -0.32f,
                )
                // a 6 6 0 0 0 -0.9 -0.63
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = -0.63f,
                )
                // l -0.16 -0.1
                lineToRelative(dx = -0.16f, dy = -0.1f)
                // l -0.33 -0.19
                lineToRelative(dx = -0.33f, dy = -0.19f)
                // l -0.09 -0.07
                lineToRelative(dx = -0.09f, dy = -0.07f)
                // l -0.03 -0.03
                lineToRelative(dx = -0.03f, dy = -0.03f)
                // H 7.67
                horizontalLineTo(x = 7.67f)
                // A 0.7 0.7 0 0 1 7.4 10.2
                arcTo(
                    horizontalEllipseRadius = 0.7f,
                    verticalEllipseRadius = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.4f,
                    y1 = 10.2f,
                )
                // a 0.6 0.6 0 0 1 0.12 -0.46
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.12f,
                    dy1 = -0.46f,
                )
                // A 0.6 0.6 0 0 1 8 9.53
                arcTo(
                    horizontalEllipseRadius = 0.6f,
                    verticalEllipseRadius = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 9.53f,
                )
                // a 0.7 0.7 0 0 1 0.42 0.16
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.42f,
                    dy1 = 0.16f,
                )
                // l 0.04 0.03
                lineToRelative(dx = 0.04f, dy = 0.03f)
                // l 0.1 0.07
                lineToRelative(dx = 0.1f, dy = 0.07f)
                // l 0.26 0.28
                lineToRelative(dx = 0.26f, dy = 0.28f)
                // l 0.13 0.14
                lineToRelative(dx = 0.13f, dy = 0.14f)
                // l 0.01 0.01
                lineToRelative(dx = 0.01f, dy = 0.01f)
                // a 6 6 0 0 0 0.8 0.72
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.8f,
                    dy1 = 0.72f,
                )
                // a 0.4 0.4 0 0 0 0.3 0.05
                arcToRelative(
                    a = 0.4f,
                    b = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.3f,
                    dy1 = 0.05f,
                )
                // l 0.05 -0.01
                lineToRelative(dx = 0.05f, dy = -0.01f)
                // l 0.22 0.15
                lineToRelative(dx = 0.22f, dy = 0.15f)
                // a 7.7 7.7 0 0 1 3.92 -2.24
                arcToRelative(
                    a = 7.7f,
                    b = 7.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.92f,
                    dy1 = -2.24f,
                )
                // a 8 8 0 0 1 1.08 -0.17
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.08f,
                    dy1 = -0.17f,
                )
                // l 0.02 -0.25
                lineToRelative(dx = 0.02f, dy = -0.25f)
                // a 1 1 0 0 0 0.2 -0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.2f,
                    dy1 = -0.3f,
                )
                // a 6 6 0 0 0 -0.07 -1.09
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.07f,
                    dy1 = -1.09f,
                )
                // l -0.04 -0.2
                lineToRelative(dx = -0.04f, dy = -0.2f)
                // L 15.4 6.5
                lineTo(x = 15.4f, y = 6.5f)
                // V 6.33
                verticalLineTo(y = 6.33f)
                // a 0.6 0.6 0 1 1 1.21 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.21f,
                    dy1 = 0.0f,
                )
                // V 6.5
                verticalLineTo(y = 6.5f)
                // l -0.04 0.38
                lineToRelative(dx = -0.04f, dy = 0.38f)
                // l -0.04 0.2
                lineToRelative(dx = -0.04f, dy = 0.2f)
                // V 7.1
                verticalLineTo(y = 7.1f)
                // a 6 6 0 0 0 -0.06 1.05
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.06f,
                    dy1 = 1.05f,
                )
                // a 0.4 0.4 0 0 0 0.16 0.27
                arcToRelative(
                    a = 0.4f,
                    b = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.16f,
                    dy1 = 0.27f,
                )
                // l 0.03 0.03
                lineToRelative(dx = 0.03f, dy = 0.03f)
                // l 0.02 0.27
                lineToRelative(dx = 0.02f, dy = 0.27f)
                // a 8 8 0 0 1 2.71 0.75
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.71f,
                    dy1 = 0.75f,
                )
                // a 8 8 0 0 1 2.27 1.65
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.27f,
                    dy1 = 1.65f,
                )
                // l 0.22 -0.16
                lineToRelative(dx = 0.22f, dy = -0.16f)
                // h 0.04
                horizontalLineToRelative(dx = 0.04f)
                // a 1 1 0 0 0 0.33 -0.04
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.33f,
                    dy1 = -0.04f,
                )
                // a 6 6 0 0 0 0.78 -0.7
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.78f,
                    dy1 = -0.7f,
                )
                // l 0.02 -0.03
                lineToRelative(dx = 0.02f, dy = -0.03f)
                // l 0.13 -0.14
                lineToRelative(dx = 0.13f, dy = -0.14f)
                // l 0.27 -0.28
                lineToRelative(dx = 0.27f, dy = -0.28f)
                // l 0.1 -0.08
                lineToRelative(dx = 0.1f, dy = -0.08f)
                // l 0.04 -0.03
                lineToRelative(dx = 0.04f, dy = -0.03f)
                // a 0.6 0.6 0 1 1 0.75 0.95
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.75f,
                    dy1 = 0.95f,
                )
                // l -0.04 0.04
                lineToRelative(dx = -0.04f, dy = 0.04f)
                // l -0.1 0.07
                lineToRelative(dx = -0.1f, dy = 0.07f)
                // l -0.32 0.2
                lineToRelative(dx = -0.32f, dy = 0.2f)
                // l -0.17 0.09
                lineToRelative(dx = -0.17f, dy = 0.09f)
                // a 6 6 0 0 0 -0.9 0.63
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = 0.63f,
                )
                // a 0.4 0.4 0 0 0 -0.1 0.29
                arcToRelative(
                    a = 0.4f,
                    b = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.1f,
                    dy1 = 0.29f,
                )
                // v 0.04
                verticalLineToRelative(dy = 0.04f)
                // l -0.1 0.09
                lineToRelative(dx = -0.1f, dy = 0.09f)
                // q -0.06 0.06 -0.12 0.1
                quadToRelative(
                    dx1 = -0.06f,
                    dy1 = 0.06f,
                    dx2 = -0.12f,
                    dy2 = 0.1f,
                )
                // a 7.8 7.8 0 0 1 1.25 5.4
                arcToRelative(
                    a = 7.8f,
                    b = 7.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.25f,
                    dy1 = 5.4f,
                )
                // l 0.24 0.07
                lineToRelative(dx = 0.24f, dy = 0.07f)
                // l 0.02 0.03
                lineToRelative(dx = 0.02f, dy = 0.03f)
                // a 1 1 0 0 0 0.24 0.23
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.24f,
                    dy1 = 0.23f,
                )
                // a 6 6 0 0 0 1.06 0.18
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.06f,
                    dy1 = 0.18f,
                )
                // h 0.02
                horizontalLineToRelative(dx = 0.02f)
                // l 0.2 0.01
                lineToRelative(dx = 0.2f, dy = 0.01f)
                // l 0.37 0.04
                lineToRelative(dx = 0.37f, dy = 0.04f)
                // l 0.11 0.02
                lineToRelative(dx = 0.11f, dy = 0.02f)
                // l 0.07 0.02
                lineToRelative(dx = 0.07f, dy = 0.02f)
                // a 0.64 0.64 0 0 1 0.5 0.74
                arcToRelative(
                    a = 0.64f,
                    b = 0.64f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.5f,
                    dy1 = 0.74f,
                )
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _logoKubernetes = it }
    }

@Suppress("ObjectPropertyName")
private var _logoKubernetes: ImageVector? = null
