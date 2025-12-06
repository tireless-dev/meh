package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentSet: ImageVector
    get() {
        val current = _documentSet
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DocumentSet",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M12 4 h8 v6 a2 2 0 0 0 2 2 h6 v6 h2 v-8 c0 -.3 -.1 -.5 -.3 -.7 l-7 -7 A1 1 0 0 0 22 2 H12 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h4 v-2 h-4z m10 .4 5.6 5.6 H22z M30 22 l-8 8 -4 -4 1.4 -1.4 2.6 2.6 6.6 -6.6z M4 27 H2 V7 h2z m4 1 H6 V4 h2z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // c 0 -0.3 -0.1 -0.5 -0.3 -0.7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.3f,
                    dx2 = -0.1f,
                    dy2 = -0.5f,
                    dx3 = -0.3f,
                    dy3 = -0.7f,
                )
                // l -7 -7
                lineToRelative(dx = -7.0f, dy = -7.0f)
                // A 1 1 0 0 0 22 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 2.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m 10 0.4
                moveToRelative(dx = 10.0f, dy = 0.4f)
                // l 5.6 5.6
                lineToRelative(dx = 5.6f, dy = 5.6f)
                // H 22z
                horizontalLineTo(x = 22.0f)
                close()
                // M 30 22
                moveTo(x = 30.0f, y = 22.0f)
                // l -8 8
                lineToRelative(dx = -8.0f, dy = 8.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // l 1.4 -1.4
                lineToRelative(dx = 1.4f, dy = -1.4f)
                // l 2.6 2.6
                lineToRelative(dx = 2.6f, dy = 2.6f)
                // l 6.6 -6.6z
                lineToRelative(dx = 6.6f, dy = -6.6f)
                close()
                // M 4 27
                moveTo(x = 4.0f, y = 27.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m 4 1
                moveToRelative(dx = 4.0f, dy = 1.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
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
        }.build().also { _documentSet = it }
    }

@Suppress("ObjectPropertyName")
private var _documentSet: ImageVector? = null
