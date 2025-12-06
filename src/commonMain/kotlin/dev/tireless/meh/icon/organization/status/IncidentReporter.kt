package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IncidentReporter: ImageVector
    get() {
        val current = _incidentReporter
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.IncidentReporter",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M10 13 h12 v2 H10z m0 7 h8 v-2 h-8z m0 5 h5 v-2 h-5z M7 7 h3 v3 h12 V7 h3 v6 h2 V7 a2 2 0 0 0 -2 -2 h-3 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 H7 a2 2 0 0 0 -2 2 v21 a2 2 0 0 0 2 2 h5 v-2 H7z m5 -3 h8 v4 h-8z m17.91 24.94 -6.28 -11.57 a.72 .72 0 0 0 -1.26 0 L16.1 28.94 A.72 .72 0 0 0 16.72 30 h12.56 c.54 0 .9 -.58 .63 -1.06 M22.25 21 h1.5 v4 h-1.5z M23 28 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 10z
                horizontalLineTo(x = 10.0f)
                close()
                // m 0 7
                moveToRelative(dx = 0.0f, dy = 7.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
                // m 0 5
                moveToRelative(dx = 0.0f, dy = 5.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
                // M 7 7
                moveTo(x = 7.0f, y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 21
                verticalLineToRelative(dy = 21.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 7z
                horizontalLineTo(x = 7.0f)
                close()
                // m 5 -3
                moveToRelative(dx = 5.0f, dy = -3.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
                // m 17.91 24.94
                moveToRelative(dx = 17.91f, dy = 24.94f)
                // l -6.28 -11.57
                lineToRelative(dx = -6.28f, dy = -11.57f)
                // a 0.72 0.72 0 0 0 -1.26 0
                arcToRelative(
                    a = 0.72f,
                    b = 0.72f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.26f,
                    dy1 = 0.0f,
                )
                // L 16.1 28.94
                lineTo(x = 16.1f, y = 28.94f)
                // A 0.72 0.72 0 0 0 16.72 30
                arcTo(
                    horizontalEllipseRadius = 0.72f,
                    verticalEllipseRadius = 0.72f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.72f,
                    y1 = 30.0f,
                )
                // h 12.56
                horizontalLineToRelative(dx = 12.56f)
                // c 0.54 0 0.9 -0.58 0.63 -1.06
                curveToRelative(
                    dx1 = 0.54f,
                    dy1 = 0.0f,
                    dx2 = 0.9f,
                    dy2 = -0.58f,
                    dx3 = 0.63f,
                    dy3 = -1.06f,
                )
                // M 22.25 21
                moveTo(x = 22.25f, y = 21.0f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -1.5z
                horizontalLineToRelative(dx = -1.5f)
                close()
                // M 23 28
                moveTo(x = 23.0f, y = 28.0f)
                // a 1 1 0 1 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // a 1 1 0 0 1 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
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
        }.build().also { _incidentReporter = it }
    }

@Suppress("ObjectPropertyName")
private var _incidentReporter: ImageVector? = null
