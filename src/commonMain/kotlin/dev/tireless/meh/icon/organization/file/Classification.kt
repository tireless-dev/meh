package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Classification: ImageVector
    get() {
        val current = _classification
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Classification",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="15.0" cy="19.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 19
                moveTo(x = 15.0f, y = 19.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // m27.7 9.3 -7 -7 A1 1 0 0 0 20 2 H10 a2 2 0 0 0 -2 2 v10 H6 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h2 v4 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 V10 a1 1 0 0 0 -.3 -.7 M20 4.4 l5.6 5.6 H20Z M6 16 h9.6 l3.4 3 -3.4 3 H6Z m20 12 H10 v-4 h5.6 a2 2 0 0 0 1.32 -.5 l3.39 -2.98 a2 2 0 0 0 0 -3.03 l-3.4 -3 a2 2 0 0 0 -1.3 -.49 H10 V4 h8 v6 a2 2 0 0 0 2 2 h6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.7 9.3
                moveTo(x = 27.7f, y = 9.3f)
                // l -7 -7
                lineToRelative(dx = -7.0f, dy = -7.0f)
                // A 1 1 0 0 0 20 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 2.0f,
                )
                // H 10
                horizontalLineTo(x = 10.0f)
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
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // a 1 1 0 0 0 -0.3 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.3f,
                    dy1 = -0.7f,
                )
                // M 20 4.4
                moveTo(x = 20.0f, y = 4.4f)
                // l 5.6 5.6
                lineToRelative(dx = 5.6f, dy = 5.6f)
                // H 20z
                horizontalLineTo(x = 20.0f)
                close()
                // M 6 16
                moveTo(x = 6.0f, y = 16.0f)
                // h 9.6
                horizontalLineToRelative(dx = 9.6f)
                // l 3.4 3
                lineToRelative(dx = 3.4f, dy = 3.0f)
                // l -3.4 3
                lineToRelative(dx = -3.4f, dy = 3.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
                // m 20 12
                moveToRelative(dx = 20.0f, dy = 12.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 5.6
                horizontalLineToRelative(dx = 5.6f)
                // a 2 2 0 0 0 1.32 -0.5
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.32f,
                    dy1 = -0.5f,
                )
                // l 3.39 -2.98
                lineToRelative(dx = 3.39f, dy = -2.98f)
                // a 2 2 0 0 0 0 -3.03
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.03f,
                )
                // l -3.4 -3
                lineToRelative(dx = -3.4f, dy = -3.0f)
                // a 2 2 0 0 0 -1.3 -0.49
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.3f,
                    dy1 = -0.49f,
                )
                // H 10
                horizontalLineTo(x = 10.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
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
        }.build().also { _classification = it }
    }

@Suppress("ObjectPropertyName")
private var _classification: ImageVector? = null
