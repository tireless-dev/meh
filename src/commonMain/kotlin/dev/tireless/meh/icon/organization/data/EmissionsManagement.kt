package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmissionsManagement: ImageVector
    get() {
        val current = _emissionsManagement
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.EmissionsManagement",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M4 2 H2 v26 a2 2 0 0 0 2 2 h11 v-2 H4z m19 2 v2 h3.59 L19 13.59 l-4.3 -4.3 a1 1 0 0 0 -1.4 0 L6 16.6 7.41 18 14 11.41 l4.3 4.3 a1 1 0 0 0 1.4 0 L28 7.4 V11 h2 V4z m-.52 16.86 A4 4 0 0 0 20 20 h-3 v3 a4 4 0 0 0 4 4 h1 v3 h2 v-3 h1 a5 5 0 0 0 5 -5 v-4 h-3 a5 5 0 0 0 -4.52 2.86 M22 25 h-1 a2 2 0 0 1 -2 -2 v-1 h1 a2 2 0 0 1 2 2z m6 -3 a3 3 0 0 1 -3 3 h-1 v-2 a3 3 0 0 1 3 -3 h1z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 2
                moveTo(x = 4.0f, y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
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
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
                // m 19 2
                moveToRelative(dx = 19.0f, dy = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3.59
                horizontalLineToRelative(dx = 3.59f)
                // L 19 13.59
                lineTo(x = 19.0f, y = 13.59f)
                // l -4.3 -4.3
                lineToRelative(dx = -4.3f, dy = -4.3f)
                // a 1 1 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // L 6 16.6
                lineTo(x = 6.0f, y = 16.6f)
                // L 7.41 18
                lineTo(x = 7.41f, y = 18.0f)
                // L 14 11.41
                lineTo(x = 14.0f, y = 11.41f)
                // l 4.3 4.3
                lineToRelative(dx = 4.3f, dy = 4.3f)
                // a 1 1 0 0 0 1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // L 28 7.4
                lineTo(x = 28.0f, y = 7.4f)
                // V 11
                verticalLineTo(y = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
                // m -0.52 16.86
                moveToRelative(dx = -0.52f, dy = 16.86f)
                // A 4 4 0 0 0 20 20
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 20.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 4 4 0 0 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 5 5 0 0 0 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // a 5 5 0 0 0 -4.52 2.86
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.52f,
                    dy1 = 2.86f,
                )
                // M 22 25
                moveTo(x = 22.0f, y = 25.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
                // m 6 -3
                moveToRelative(dx = 6.0f, dy = -3.0f)
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // h 1z
                horizontalLineToRelative(dx = 1.0f)
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
        }.build().also { _emissionsManagement = it }
    }

@Suppress("ObjectPropertyName")
private var _emissionsManagement: ImageVector? = null
